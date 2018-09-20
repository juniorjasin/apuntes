package ar.edu.ubp.das.classes;

public class Niño extends Tarifa {

	public Niño(double costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDescuento() {
		return 25.5d;
	}

	@Override
	public double getCosto() {
		return this.costo - this.getDescuento();
	}

	@Override
	public String getTipo() {
		return "Niño";
	}

}
