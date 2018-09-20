package ar.edu.ubp.das.empresa;

public class Gerente extends Cargo {

	public Gerente() {
		this.nombre = "GERENTE";
		this.jerarquia = 40;
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
