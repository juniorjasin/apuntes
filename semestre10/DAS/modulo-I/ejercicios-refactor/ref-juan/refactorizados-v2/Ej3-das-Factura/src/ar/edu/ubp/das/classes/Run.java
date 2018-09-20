package ar.edu.ubp.das.classes;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		Factura f = new Factura(new Date(), "PASTARINI", "MARIELA", "1234567890");
		f.addTarifa(new Tarifa(20));
		f.addTarifa(new TarifaNinios(5));
		f.addTarifa(new TarifaJubilados(10));
		
		f.addEntrada("NORMAL", 1000, 1200);
		f.addEntrada("NORMAL", 1000, 1200);
		f.addEntrada("NORMAL", 1000, 1200);
		
		f.mostrarFactura();
	}

}
