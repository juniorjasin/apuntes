package ar.edu.ubp.das.classes;

public class Cliente {
	private String apellidoCliente;
	private String nombreCliente;
	private String docCliente;

	public Cliente(String apellido, String nombre, String doc) {

	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDocCliente() {
		return docCliente;
	}

	public void setDocCliente(String docCliente) {
		this.docCliente = docCliente;
	}

}
