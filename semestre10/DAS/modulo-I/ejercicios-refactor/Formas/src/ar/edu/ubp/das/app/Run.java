package ar.edu.ubp.das.app;

import ar.edu.ubp.das.formas.Cuadrado;
import ar.edu.ubp.das.formas.Forma;
import ar.edu.ubp.das.formas.Rectangulo;
import ar.edu.ubp.das.formas.Triangulo;

public class Run {

	public static void main(String[] args) {
        Forma t, c, r;
        
        t = new Triangulo(3, 4, 4, 5);
        c = new Cuadrado(3);
        r = new Rectangulo(4, 2);
        
        System.out.println(t);
        System.out.println(c);
        System.out.println(r);
	}

}
