package com.trifulcas.ejemplos;

import java.util.HashMap;
import java.util.Map;

public class MapaHash {

	public static void main(String[] args) {
		// Especificar los tipos de los dos cmapos, la clave y el valor
		// Defino por la intefaz 'Map' y no pr HashMap
		Map<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		// Otra manera
		HashMap<Integer, String> mapita = new HashMap<Integer, String>();// Creating HashMap
		
		// Los valores se a�aden con 'put'
		// En formato clave, valor
		map.put(1, "Eva"); // Put elements in Map
		map.put(2, "Juan");
		map.put(30, "Ana");
		map.put(4, "Pep"); //{1=Eva, 2=Juan, 3=Ana, 4=Rosa}
		map.put(234, "Rosa");
		System.out.println(map);
		
		// Recorrer un HashMap
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		for(String valor:map.values()) {
			System.out.println(valor);
		}
		
		for(Integer valor:map.keySet()) {
			System.out.println(valor);
		}
		// A�ado un valor que ya existe	
		// Lo sustituye
		map.put(4, "Rosa");
		
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// Funci�n especial para a�adir s�lo si no existe
		map.putIfAbsent(4, "Pepe");
		System.out.println(map);
		map.putIfAbsent(5, "Pepe");
		System.out.println(map);
		
		// Nos elimina el elemento con la clave '2'
		map.remove(2);
		System.out.println(map);
		
		// Aqu� la clave es una cadena y el valor es de tipo alumno
		Map<String,Alumno> mapa=new HashMap<String,Alumno>();
		Map<Alumno,String> mapaalreves=new HashMap<Alumno,String>();
		
		// Los a�ado creando alumnos al vuelo
		mapa.put("Ana", new Alumno("Ana Pi",7));
		mapa.put("Eva", new Alumno("Eva Gonz�lez",8));
		mapa.put("Pep", new Alumno("Jos� Bou",6));
		
		
		// Obtener un valor concreto de una clave
		System.out.println(mapa.get("Ana"));
		
		System.out.println(mapa);
		for (Map.Entry<String, Alumno> m : mapa.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue().getNombre());
		}
		
		// Elimino por la clave
		mapa.remove("Ana");
		// Recorrer por valores, porque no me interesa la clave
		for(Alumno al:mapa.values()) {
			System.out.println(al);
		}
		
		// Muestra las claves de mi HashMap
		for(String key:mapa.keySet()) {
			System.out.println(key);
		}
		
		mapa.containsKey("Ana");
		mapa.containsValue(new Alumno("w",2));
		
		
	}

}
