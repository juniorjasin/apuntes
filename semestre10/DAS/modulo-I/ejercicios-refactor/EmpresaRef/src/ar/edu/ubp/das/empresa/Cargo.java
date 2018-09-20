package ar.edu.ubp.das.empresa;

public abstract class Cargo {
	protected String nombre;
	protected int jerarquia;

	public abstract String getNombre();

	public abstract int getJerarquia();
}
