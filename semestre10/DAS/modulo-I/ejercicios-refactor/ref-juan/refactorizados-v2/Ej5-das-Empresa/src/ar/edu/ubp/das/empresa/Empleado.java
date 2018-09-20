package ar.edu.ubp.das.empresa;

public class Empleado implements Comparable<Empleado> {
	
	private int    nroLegajo;
	private String apellido;
	private String nombre;
	private Cargo  cargo;
	private Depto  departamento;
	
	public Empleado(String apellido, String nombre, Cargo cargo, Depto departamento) {
		this.nroLegajo      = Empresa.getInstance().getNroLegajo();
		this.apellido       = apellido.toUpperCase();
		this.nombre         = nombre.toUpperCase();
		this.cargo          = cargo;
		this.departamento = departamento;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public Cargo getCargo() {
		return cargo;
	}
	
	public Depto getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Depto departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return nroLegajo + " " + apellido + ", " + nombre + " (" + cargo.getNombreCargo() + ")";
	}
	
	@Override
	public int compareTo(Empleado emp) {
        if(this.nroLegajo == emp.getNroLegajo())
            return 0;
        else if(this.nroLegajo < emp.getNroLegajo())
            return -1;
        else
            return 1;
	}

}
