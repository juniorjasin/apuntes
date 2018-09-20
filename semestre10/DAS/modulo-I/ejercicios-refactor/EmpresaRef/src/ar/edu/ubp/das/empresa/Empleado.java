package ar.edu.ubp.das.empresa;

public class Empleado implements Comparable<Empleado> {
	private int nroLegajo;

	private String apellido;
	private String nombre;
	private Cargo cargo;
	private int jerarquiaCargo;
	private Depto depto;

	public Empleado(String apellido, String nombre, Cargo cargo, int nroLegajo) {
		this.nroLegajo = nroLegajo;
		this.apellido = apellido.toUpperCase();
		this.nombre = nombre.toUpperCase();
		this.cargo = cargo;
		this.jerarquiaCargo = cargo.getJerarquia();
	}

	public int getNroLegajo() {
		return this.nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public int getJerarquiaCargo() {
		return this.jerarquiaCargo;
	}

	public Depto getDepto() {
		return depto;
	}

	public void setDepto(Depto depto) {
		this.depto = depto;
	}

	@Override
	public String toString() {
		return this.nroLegajo + " " + this.apellido + ", " + this.nombre + " (" + this.cargo.getNombre() + ")";
	}

	@Override
	public int compareTo(Empleado emp) {
		if (this.nroLegajo == emp.getNroLegajo())
			return 0;
		else if (this.nroLegajo < emp.getNroLegajo())
			return -1;
		else
			return 1;
	}
}