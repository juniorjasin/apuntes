package ar.edu.ubp.das.empresa;

public class Contable extends Cargo {

	public Contable() {
		this.nombre = "CONTABLE";
		this.jerarquia = 20;
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
