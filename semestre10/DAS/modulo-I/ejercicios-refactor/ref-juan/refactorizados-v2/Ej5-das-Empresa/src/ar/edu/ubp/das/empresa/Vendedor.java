package ar.edu.ubp.das.empresa;

public class Vendedor extends Cargo {
	public int getJerarquiaCargo() {
		return 30;
	}
	
	public String getNombreCargo() {
		return "VENDEDOR";
	}
}
