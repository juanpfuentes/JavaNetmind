package com.trifulcas.ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemplosHashMap {

	public static void main(String[] args) {

		// Me creo un map con alumnos
		Map<String, Alumno> alumnos = new HashMap<String, Alumno>();
		alumnos.put("Ana", new Alumno("Ana Pi", 7));
		alumnos.put("Eva", new Alumno("Eva Gonz�lez", 8));
		alumnos.put("Pep", new Alumno("Jos� Bou", 6));
		alumnos.put("Rosa", new Alumno("Rosa", 3));
		alumnos.put("Juan", new Alumno("Juan", 4));

		System.out.println(mejorAlumno(alumnos));
		System.out.println(aprobados(alumnos));
		
		
		
		
	}

	// Paso como par�metro un hashmap y devuelvo un resultadop
	public static Alumno mejorAlumno(Map<String, Alumno> alumnos) {
		Alumno res = null;
		for (Alumno alumno : alumnos.values()) {
			if (res == null || alumno.getNota() > res.getNota()) {
				res = alumno;
			}
		}
		return res;
	}

	// Paso como par�metro un hashmap y devuelvo otro hashmap
	// Filtrando los aprobados
	public static Map<String, Alumno> aprobados(Map<String, Alumno> alumnos) {
		Map<String, Alumno> res = new HashMap<String, Alumno>();
		// Recorrer el mapa en un par clave valor y filtrar los alumnos
		for (Map.Entry<String, Alumno> alumno : alumnos.entrySet()) {
			if (alumno.getValue().getNota() >= 5) {
				res.put(alumno.getKey(), alumno.getValue());
			}
		}
		return res;
	}
}
