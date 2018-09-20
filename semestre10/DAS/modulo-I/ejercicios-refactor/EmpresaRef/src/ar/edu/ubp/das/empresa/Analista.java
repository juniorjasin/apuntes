package ar.edu.ubp.das.empresa;

public class Analista extends Cargo {

	public Analista() {
		this.nombre = "ANALISTA";
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
