package ar.edu.ubp.das.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ar.edu.ubp.das.formas.Cuadrado;
import ar.edu.ubp.das.formas.Forma;
import ar.edu.ubp.das.formas.Rectangulo;
import ar.edu.ubp.das.formas.Triangulo;

public class FormasTestCase {

	private Forma triangulo;
	private Forma cuadrado;
	private Forma rectangulo;

	@Before
	public void setUp() {
		this.triangulo  = new Triangulo(5, 2.4, 3, 4);
		this.cuadrado   = new Cuadrado(6.25);
		this.rectangulo = new Rectangulo(4.5, 7.9); 
	}
		
	@Test
	public void testAreaTriangulo() {
		double expectedValue = 6d;
		assertEquals(expectedValue, this.triangulo.getArea(), Math.ulp(expectedValue));
	}

	@Test
	public void testPerimetroTriangulo() {
		double expectedValue = 12d;
		assertEquals(expectedValue, this.triangulo.getPerimetro(), Math.ulp(expectedValue));
	}

	@Test
	public void testAreaCuadrado() {
		double expectedValue = 39.0625d;
		assertEquals(expectedValue, this.cuadrado.getArea(), Math.ulp(expectedValue));
	}

	@Test
	public void testPerimetroCuadrado() {
		double expectedValue = 25d;
		assertEquals(expectedValue, this.cuadrado.getPerimetro(), Math.ulp(expectedValue));
	}
	
	@Test
	public void testAreaRectangulo() {
		double expectedValue = 35.55d;
		assertEquals(expectedValue, this.rectangulo.getArea(), Math.ulp(expectedValue));
	}

	@Test
	public void testPerimetroRectangulo() {
		double expectedValue = 24.8d;
		assertEquals(expectedValue, this.rectangulo.getPerimetro(), Math.ulp(expectedValue));
	}

}
