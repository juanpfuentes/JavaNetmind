package com.peliculas.dao;

import java.sql.Date;

public class Peliculas {
	private int id_peliculas;
	private String titulo;
	private Date fecha;
	private String director;
	
	public Peliculas(int id_peliculas, String titulo, Date fecha, String director) {
		this.id_peliculas=id_peliculas;
		this.titulo=titulo;
		this.fecha=fecha;
		this.director=director;
	}


	public int getId_peliculas() {
		return id_peliculas;
	}


	public void setId_peliculas(int id_peliculas) {
		this.id_peliculas = id_peliculas;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String toString() {
		return "Peliculas [id=" + id_peliculas + ", titulo=" + titulo + ", fecha=" + fecha + ", director=" + director
				+ "]";
	}
	
	
}
