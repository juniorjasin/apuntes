package ar.edu.ubp.das.test;

import java.awt.Color;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.edu.ubp.das.app.Punto;
import ar.edu.ubp.das.app.Run;

public class PuntosTestCase {

	private Run app;
	private LinkedList<Punto> puntos;

	@Before
	public void setUp() throws Exception {
		this.app = new Run();
		
        Punto p0 = new Punto();
              p0.setX(10);
              p0.setY(20);
		
        Punto p1 = new Punto();
              p1.setX(5);
              p1.setY(40);

        Punto p2 = new Punto();
              p2.setX(40);
              p2.setY(77);

        Punto p3 = new Punto();
              p3.setX(33);
              p3.setY(61);
              
        this.puntos = new LinkedList<Punto>();
        this.puntos.add(p0);
        this.puntos.add(p1);
        this.puntos.add(p2);
        this.puntos.add(p3);
	}

	@Test
	public void testPuntoRojo() {
		Assert.assertSame(Color.RED, this.puntos.get(0).getColor());
	}

	@Test
	public void testPuntoAmarrillo() {
		Assert.assertSame(Color.YELLOW, this.puntos.get(1).getColor());
	}

	@Test
	public void testPuntoVerde() {
		Assert.assertSame(Color.GREEN, this.puntos.get(2).getColor());
	}

	@Test
	public void testPuntoAzul() {
		Assert.assertSame(Color.BLUE, this.puntos.get(3).getColor());
	}

}
