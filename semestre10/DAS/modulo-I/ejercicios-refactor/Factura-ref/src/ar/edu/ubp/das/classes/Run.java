package ar.edu.ubp.das.classes;

import java.util.Date;

// obsesion primitiva es el que se necesita para separar clases

public class Run {

	public static void main(String[] args) {
		Factura f = new Factura(new Date(), "PASTARINI", "MARIELA", "1234567890");
		f.addTarifa("NORMAL", 20);
		f.addTarifa("NI�OS", 5);
		f.addTarifa("JUBILADOS", 10);

		f.addEntrada("NORMAL", 1000, 1200);
		f.addEntrada("NORMAL", 1000, 1200);
		f.addEntrada("NORMAL", 1000, 1200);

		f.mostrarFactura();
	}

}
