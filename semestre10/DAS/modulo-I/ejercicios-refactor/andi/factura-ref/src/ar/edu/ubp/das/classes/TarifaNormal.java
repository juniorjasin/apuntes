package ar.edu.ubp.das.classes;

public class TarifaNormal extends Tarifa {

	public TarifaNormal(double costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return "Normal";
	}

	public double getDescuento() {
		return 0d;
	}
}
