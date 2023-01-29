package com.trifulcas.TestMavenRapido;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComprobarCadenas {
	Cadenas cadenas=new Cadenas();
	@Test
	public void testEsPalindromo() {
		assertTrue(cadenas.esPalindromo("Sara Baras"));
		assertTrue(cadenas.esPalindromo("@Sara, Baras. "));
		assertFalse(cadenas.esPalindromo("Hola que tal"));
	}

	@Test
	public void testNormalizar() {
		assertEquals("aeiou",cadenas.normalizar("ÁÉíóÜ"));
		assertEquals("holaquetal",cadenas.normalizar("Hola QUE tal"));
		assertEquals("viuncamion",cadenas.normalizar("Vi. Un. Camión."));
		assertEquals("",cadenas.normalizar(",. #@"));
	}

}
