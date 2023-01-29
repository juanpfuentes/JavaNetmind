package com.peliculas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class PeliculasDAO {
	private Connection con;
	
	public PeliculasDAO() {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prestamos", "root", "");
 
        } catch (Exception ex) {
            System.out.println(ex);
        }	
	}
	
	public Peliculas getPelicula(int id) {
		try {
			String sql="select * from peliculas where id_peliculas=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1,id);
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				Peliculas pelicula=new Peliculas(rs.getInt("id_peliculas"),rs.getString("titulo"),rs.getDate("fecha"),rs.getString("director"));
				return pelicula;
			} else {
				return null;
			}
		} catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
	
	public List<Peliculas> getPeliculas() {
		try {
			String sql="select * from peliculas";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			List<Peliculas> peliculas=new ArrayList<Peliculas>();
			while(rs.next()) {
				Peliculas pelicula=new Peliculas(rs.getInt("id_peliculas"),rs.getString("titulo"),rs.getDate("fecha"),rs.getString("director"));
				peliculas.add(pelicula);
			}
			return peliculas;
			
		}catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
	
	public int addPelicula(Peliculas pelicula) {
		try {
			String sql="insert into peliculas (titulo, fecha, director) values (?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, pelicula.getTitulo());
			stmt.setDate(2, pelicula.getFecha());
			stmt.setString(3, pelicula.getDirector());	
			int res=stmt.executeUpdate();
			return res;
		} catch (Exception ex) {
			System.out.println(ex);
			return -1;
		}
	}
	
	public int deletePelicula(int id) {
		try {
			String sql="delete from peliculas where id_peliculas=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, id);
			int res=stmt.executeUpdate();
			return res;
		} catch(Exception ex) {
			System.out.println(ex);
			return -1;
		}
	}
	
	public int modificarPelicula(Peliculas pelicula) {
		try {
			String sql="update peliculas set titulo=?, fecha=?, director=? where id_peliculas=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, pelicula.getTitulo());
			stmt.setDate(2, pelicula.getFecha());
			stmt.setString(3, pelicula.getDirector());
			stmt.setInt(4, pelicula.getId_peliculas());
			
			int res=stmt.executeUpdate();
			return res;
					
		} catch(Exception ex) {
			System.out.println(ex);
			return -1; 
		}
	}

}
