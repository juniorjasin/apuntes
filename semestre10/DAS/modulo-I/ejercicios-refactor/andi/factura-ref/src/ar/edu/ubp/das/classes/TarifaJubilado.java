package ar.edu.ubp.das.classes;

public class TarifaJubilado extends Tarifa {

	public TarifaJubilado(double costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return "Jubilado";
	}

	public double getDescuento() {
		return 35d;
	}

}
