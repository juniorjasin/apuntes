package ar.edu.ubp.das.classes;

public class Tarifa {

	private double costo;

	public Tarifa(double costo) {
		this.costo = costo;
	}
	
	public String getTipo() {
		return "NORMAL";
	}
	
	public double getDescuento() {
		return 0d;
	}
	
	public double getCosto() {
		return this.costo - this.getDescuento();
	}
}
