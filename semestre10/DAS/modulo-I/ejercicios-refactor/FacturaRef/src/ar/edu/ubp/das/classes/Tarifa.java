package ar.edu.ubp.das.classes;

public abstract class Tarifa {

	public Tarifa(double costo) {
		this.costo = costo;
	}

	protected double costo;

	public abstract String getTipo();

	public abstract double getDescuento();

	public abstract double getCosto();

}
