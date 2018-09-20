package ar.edu.ubp.das.empresa;

public class Vendedor extends Cargo {

	public Vendedor() {
		this.nombre = "VENDEDOR";
		this.jerarquia = 30;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int getJerarquia() {
		return this.jerarquia;
	}
}
