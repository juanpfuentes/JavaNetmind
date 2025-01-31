package com.trifulcas.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		// Definici�n de ArrayList
		// Lo que est� entre '<' y '>' es un tipo gen�rico
		// Esto es correcto y lo preferido
		List<String> lista = new ArrayList<String>();

		List<Integer> numeros=new ArrayList<Integer>();
		
		numeros.add(1);
		
		List<String[]> alista = new ArrayList<String[]>();
		String[] foo={"aaa","bbb"};
		alista.add(foo);
		System.out.println(alista);
		// Esto es completamente correcto
		ArrayList<String> otraLista = new ArrayList<String>();

		// Para a�adir 'add'. Si no especificamos posici�n, se a�ade al final
		// Si especificamos posici�n se a�ade en esa posici�n
		lista.add("Eva"); // ['Eva']
		lista.add("Juan"); // ['Eva','Juan']
		lista.add(1, "Ana");// ['Eva','Ana','Juan']
		lista.add(0, "Pep");// ['Pep','Eva','Ana','Juan']

		// Al imprimir se muestra de una manera bastante visual
		System.out.println(lista);

		// Con get obtenemos el elemento en esa posici�n
		System.out.println(lista.get(0));

		// Cambiar el elemento que est� en una posici�n determinada
		lista.set(1, "Pep"); // ['Pep','Pep','Ana','Juan']

		System.out.println(lista);

		// Nos elimina el elemento en la posici�n 1
		lista.remove(1); // ['Pep','Ana','Juan']
		System.out.println(lista);
		// Nos elimina el elemento que vale "Ana"
		lista.remove("Ana"); // ['Pep','Juan']
		System.out.println(lista);
		lista.add("Eva");
		lista.add("Juan");
		//lista.add(10, "Ana");
		
		// Recorrer con un foreach
		for (String l : lista) {
			System.out.println(l);
		}
		
		// Recorrer con un for normal
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		// contains nos dice si un elemento est� o no est� en el arraylist
		// true or false
		System.out.println(lista.contains("Eva")); // true
		// indexOf nos dice la posici�n del elemento en el arraylist
		System.out.println(lista.indexOf("Juan")); // 2
		System.out.println(lista.indexOf("Rosa")); // -1
		// Podemos ordenar usando la utilidad sort de la clase Collections
		Collections.sort(lista);
		System.out.println(lista);
		Collections.shuffle(lista);
		System.out.println(lista);
		
	}

	public static String may(String cad) {
		return cad.toUpperCase();
	}
}
