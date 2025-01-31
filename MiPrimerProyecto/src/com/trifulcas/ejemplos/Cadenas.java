package com.trifulcas.ejemplos;

public class Cadenas {

	public static void main(String[] args) {
		
	
		
		String s = "JavadesdeCero";
		// o String s= new String ("JavadesdeCero");
		// Devuelve la cantidad de caracteres en la Cadena.
		System.out.println("String length = " + s.length());
		// Devuelve el car�cter en el �ndice i.
		System.out.println("Character at 3rd position = " + s.charAt(3));
		// Devuelve la subcadena del car�cter �ndice i-�simo
		// al final de la cadena
		System.out.println("Substring " + s.substring(3));
		// Devuelve la subcadena del �ndice i a j-1.
		System.out.println("Substring  = " + s.substring(2, 5));
		// Concatena string2 hasta el final de string1.
		String s1 = "Java";
		String s2 = "desdeCero";
		String s3="Ja";
		s3+="va";
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println("String concatenado  = " + s1.concat(s2));
		// Devuelve el �ndice dentro de la cadena de
		// la primera aparici�n de la cadena especificada.
		String s4 = "Java desde Cero";
		System.out.println("�ndice de Cero: " + s4.indexOf("Cero"));
		// Devuelve el �ndice dentro de la cadena de
		// la primera aparici�n de la cadena especificada,
		// comenzando en el �ndice especificado.
		System.out.println("�ndice de a  = " + s4.indexOf('a', 4));
		// Comprobando la igualdad de cadenas
		Boolean out = "Java".equals("java");
		System.out.println("Comprobando la igualdad: " + out);
		out = "Java".equals("Java");
		System.out.println("Comprobando la igualdad: " + out);
		out = "Java".equalsIgnoreCase("jaVA");
		System.out.println("Comprobando la igualdad: " + out);
		int out1 = s1.compareTo(s2);
		System.out.println("Si s1 = s2: " + out1);
		// Conversi�n de cases
		String palabra1 = "JavadesdeCero";
		System.out.println("Cambiando a min�sculas: " + palabra1.toLowerCase());
		// Conversi�n de cases
		String palabra2 = "JavadesdeCero";
		System.out.println("Cambiando a MAY�SCULAS: " + palabra1.toUpperCase());
		// Recortando la palabra
		String word4 = " JavadesdeCero ";
		System.out.println("Recortando la palabra: " + word4.trim());
		// Reemplazar caracteres
		String str1 = "YavadesdeCero";
		System.out.println("String Original: " + str1);
		String str2 = "YavadesdeCero".replace('Y', 'J');
		System.out.println("Reemplazando Y por J -> " + str2);
		
		System.out.println(veces("a","holA qaue tal"));
	}

	public static int veces(String aguja, String pajar) {
		aguja=aguja.toLowerCase();
		pajar=pajar.toLowerCase();
		int pos=pajar.indexOf(aguja);
		int cont=0;
		while(pos!=-1) {
			cont++;
			pos=pajar.indexOf(aguja,pos+1);
		}
		return cont;
	}
	
}
