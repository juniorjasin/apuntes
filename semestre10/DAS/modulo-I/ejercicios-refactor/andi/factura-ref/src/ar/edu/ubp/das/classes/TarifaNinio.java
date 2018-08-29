package ar.edu.ubp.das.classes;

public class TarifaNinio extends Tarifa {

	public TarifaNinio(double costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return "Niño";
	}

	public double getDescuento() {
		return 25.5d;
	}

}
