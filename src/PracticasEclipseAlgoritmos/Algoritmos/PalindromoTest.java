package PracticasEclipseAlgoritmos.Algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromoTest {
	
	Palindromo palindromo = new Palindromo();

	@Test
	public void palindromoHappyPath() {
		boolean response = palindromo.esPalindromo("ANA");
		assertTrue(response);
	}

	@Test
	public void invalidPalindromo() {
		boolean response = palindromo.esPalindromo("Yordy");
		assertFalse(response);
	}
	
	@Test
	public void validPalindromoWithLowerAndUpperCase() {
		boolean response = palindromo.esPalindromo("Ana");
		assertTrue(response);
	}
	
	/*
	@Test(expected = IllegalArgumentException.class)
	public void invalidPalindromo() {
		palindromo.esPalindromo("Yordy");
	}
	 * */
}
