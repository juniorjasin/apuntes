package ar.edu.ubp.das.empresa;

public class Depto {
	private String               nombre;
	
	public Depto(String nombre) {
		this.nombre = nombre.toUpperCase();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString(){ 
		String        endLine   = System.getProperty("line.separator");
		StringBuilder infoDepto = new StringBuilder();
                      infoDepto.append("DEPTO: ").append(nombre).append(endLine);
		return infoDepto.toString();
	}
	
}
