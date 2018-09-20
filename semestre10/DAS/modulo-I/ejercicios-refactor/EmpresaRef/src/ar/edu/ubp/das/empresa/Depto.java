package ar.edu.ubp.das.empresa;

public class Depto {

	private String nombre;

	public Depto(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
