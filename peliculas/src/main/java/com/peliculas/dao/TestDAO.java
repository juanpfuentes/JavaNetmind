package com.peliculas.dao;

import java.sql.Date;

public class TestDAO {

	public static void main(String[] args) {
		PeliculasDAO pruebaCon= new PeliculasDAO();
		//System.out.println(pruebaCon.getPelicula(2));
		//System.out.println(pruebaCon.getPeliculas());
		
		Peliculas res=new Peliculas(1, "Mar Beauty",Date.valueOf("2021-01-01"),"Mar");
		//System.out.println(res);
		System.out.println(pruebaCon.addPelicula(res));
		//System.out.println(pruebaCon.deletePelicula(3));
		
		System.out.println(pruebaCon.getPeliculas());
		
	}
	
}
