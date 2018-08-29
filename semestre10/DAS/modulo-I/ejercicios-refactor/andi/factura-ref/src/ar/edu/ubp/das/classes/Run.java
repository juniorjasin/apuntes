package ar.edu.ubp.das.classes;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		Factura f = new Factura(new Date(), new Cliente("PASTARINI", "MARIELA", "1234567890"));
		f.addTarifa(new TarifaNormal(20));
		f.addTarifa(new TarifaNinio(5));
		f.addTarifa(new TarifaJubilado(10));

		f.addEntrada("NORMAL", 1000, 1200);
		f.addEntrada("NORMAL", 1000, 1200);
		f.addEntrada("NORMAL", 1000, 1200);

		f.mostrarFactura();
	}

}
