package ar.edu.ubp.das.classes;

public class Normal extends Tarifa {

	public Normal(double costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0d;
	}

	@Override
	public double getCosto() {
		return this.costo - this.getDescuento();
	}

	@Override
	public String getTipo() {
		return "Normal";
	}

}
