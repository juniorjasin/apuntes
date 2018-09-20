package ar.edu.ubp.das.empresa;

public class Operario extends Cargo {

	public Operario() {
		this.nombre = "OPERARIO";
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
