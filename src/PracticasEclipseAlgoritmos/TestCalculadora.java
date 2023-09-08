package PracticasEclipseAlgoritmos;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	private Calculadora calc;
	
	public void escenario() {
		calc = new Calculadora();
	}
	public void testSumar() {
		escenario();
		assertTrue(calc.sumar(2, 2)==(2+2));
	}
	public void testRestar() {
		escenario();
		assertEquals(3, calc.restar(5, 2));
	}
	public void testMultiplicar() {
		escenario();
		assertTrue(calc.multiplicar(2, 3)==(2*3));
	}
	
	@Test
	public void testDivide() {
		escenario();
		assertEquals(10, calc.divide(100, 10));
	}
}
