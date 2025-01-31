package com.trifulcas.ejemplos;

public class Ejercicios {

	public static void main(String[] args) {
		String[] cadenas= {"No subas, abusón","Yo dono rosas, oro no doy","No traces en ese cart�n"};
		System.out.println(esPalindromo("Viva la paella"));
		System.out.println(esPalindromo("Sara Baras"));
		System.out.println(esPalindromo("Isaac no ronca as�"));
		for(String cadena:cadenas) {
			System.out.println(esPalindromo(cadena));
		}
		System.out.println("Con clase");
		Palindromo pal=new Palindromo("D�bale arroz a la zorra el abad");
		System.out.println(pal.esPalindromo());
	}

	// Una cadena es pal�ndromo si es igual a ella misma invertida
	public static boolean esPalindromo(String cadena) {
		cadena = normalizar(cadena);
		StringBuilder foo = new StringBuilder(cadena);
		return cadena.equals(foo.reverse().toString());
	}
	
	// He creado una funci�n normalizar para otros caracteres
	public static String normalizar(String cadena) {
		return cadena.toLowerCase().replace("�", "a").replace("�", "e").replace("�", "i").replace("�", "o")
				.replace("�", "u").replace("�","u").replace(" ", "").replace(".", "").replace(",", "");
	}
	
	// La estructura if (condicion) return true else return false es igual a:
	// return condicion
}
