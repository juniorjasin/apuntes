package ar.edu.ubp.das.classes;

public abstract class Tarifa {
	public double costo;

	public Tarifa(double costo) {
		this.costo = costo;
	}

	public abstract String getTipo();

	public abstract double getDescuento();

	public double getCosto() {
		return this.costo - this.getDescuento();
	}
}
