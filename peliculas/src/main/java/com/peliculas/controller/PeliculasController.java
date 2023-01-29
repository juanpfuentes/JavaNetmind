package com.peliculas.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.peliculas.dao.Peliculas;
import com.peliculas.dao.PeliculasDAO;

/**
 * Servlet implementation class PeliculasController
 */
@WebServlet("/mantenimiento")
public class PeliculasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PeliculasDAO modelo;
	HttpSession session;
	RequestDispatcher dispatcher;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PeliculasController() {
        super();
        modelo=new PeliculasDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion=request.getParameter("accion");
		if(accion == null) {
			accion="";
		}
		
		switch (accion) {
		case "nueva":
			response.sendRedirect("mantenimiento_nueva.jsp");
			break;
		case "insert":
			try{
				String titulo=request.getParameter("titulo");
				java.sql.Date fecha=java.sql.Date.valueOf(request.getParameter("fecha"));
				String director=request.getParameter("director");
				Peliculas pelicula=new Peliculas(1,titulo,fecha,director);
				modelo.addPelicula(pelicula);
				response.sendRedirect("mantenimiento");
			} catch(Exception ex) {
				System.out.println(ex);
				RequestDispatcher dispatcher = request.getRequestDispatcher("mantenimiento_nueva.jsp");
		        dispatcher.forward(request, response);	
			}
			break;
		case "editar":
			Integer id=Integer.parseInt(request.getParameter("id"));
			if(id!=null) {
				session = request.getSession();
				session.setAttribute("id", id);
				Peliculas res=modelo.getPelicula(id);
				request.setAttribute("titulo", res.getTitulo());
				request.setAttribute("fecha", res.getFecha());
				request.setAttribute("director", res.getDirector());
				RequestDispatcher dispatcher = request.getRequestDispatcher("mantenimiento_editar.jsp");
		        dispatcher.forward(request, response);
			}
			break;
		case "actualizar":
			try {
				Integer id2=(Integer) session.getAttribute("id");
				String titulo= request.getParameter("titulo");
				java.sql.Date fecha=java.sql.Date.valueOf(request.getParameter("fecha"));
				String director = request.getParameter("director");
				request.setAttribute("titulo", titulo);
				request.setAttribute("fecha", fecha);
				request.setAttribute("director", director);			
			Peliculas res=new Peliculas(id2,titulo,fecha,director);
			modelo.modificarPelicula(res);
			response.sendRedirect("mantenimiento");
			} catch (Exception ex) {
				System.out.println(ex);
				RequestDispatcher dispatcher = request.getRequestDispatcher("mantenimiento_editar.jsp");
		        dispatcher.forward(request, response);	
			}
			break;
		case "eliminar":
			id=Integer.parseInt(request.getParameter("id"));
			if(id!=null) {
				modelo.deletePelicula(id);
			}
			response.sendRedirect("mantenimiento");
			break;
		default:
			List<Peliculas> peliculas= modelo.getPeliculas();
	        request.setAttribute("peliculas", peliculas);
			dispatcher = request.getRequestDispatcher("mantenimiento.jsp");
	        dispatcher.forward(request, response);
	        break;
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
