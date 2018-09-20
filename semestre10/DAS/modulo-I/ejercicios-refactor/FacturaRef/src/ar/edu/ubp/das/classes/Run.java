package ar.edu.ubp.das.classes;

import java.util.Date;

// obsesion primitiva es el que se necesita para separar clases

public class Run {

	public static void main(String[] args) {
		Factura f = new Factura(new Date(), new Cliente("PASTARINI", "MARIELA", "1234567890"));
		f.addTarifa(new Normal(20));
		f.addTarifa(new Niño(5));
		f.addTarifa(new Jubilado(10));

		f.addEntrada("Normal", 1000, 1200);
		f.addEntrada("Normal", 1000, 1200);
		f.addEntrada("Normal", 1000, 1200);

		f.mostrarFactura();
	}

}
