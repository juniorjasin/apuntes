package ar.edu.ubp.das.empresa;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Depto {

	public enum Cargo {
		GERENTE,
		VENDEDOR,
		ANALISTA,
		OPERARIO,
		CONTABLE
	}
	
	private LinkedList<Empleado> emp;
	private String               nombre;
	
	public Depto(String nombre) {
		this.nombre = nombre.toUpperCase();
		this.emp    = new LinkedList<Empleado>();
	}
	
	public void addEmp(String apellido, String nombre, Cargo cargo) {
		emp.add(new Empleado(apellido, nombre, cargo));
	}
	
	public void removeEmp(int nroLegajo) {
		for (Empleado e : emp) {
			if(nroLegajo == e.nroLegajo) {
				emp.remove(e);
			}
		}	
	}
	
	public String getNombre() {
		return this.nombre;
	}
		
	public int getNroLegajo() {
		if(emp.size() == 0) {
			return 1;
		}		
		return Collections.max(emp).getNroLegajo() + 1;
	}
	
	public int getJerarquiaCargo(Cargo cargo) {
		switch(cargo) {
			case GERENTE:
				return 40;
			case ANALISTA:
			case VENDEDOR:
				return 30;
			case CONTABLE:
				return 20;
			case OPERARIO:
			default:
				return 10;
		}
	}	
	
	@Override
	public String toString(){ 
		String        endLine   = System.getProperty("line.separator");
		StringBuilder infoDepto = new StringBuilder();
                      infoDepto.append("DEPTO: ").append(nombre).append(endLine);		
		
        Collections.sort(emp, new EmpleadoComparator());
        
        for(Empleado e : emp) {
			infoDepto.append(e).append(endLine);
		}		
		return infoDepto.toString();
	}
	
	public class Empleado implements Comparable<Empleado> {
		
		private int    nroLegajo;
		private String apellido;
		private String nombre;
		private Cargo  cargo;
		private int    jerarquiaCargo;
		
		public Empleado(String apellido, String nombre, Cargo cargo) {
			this.nroLegajo      = Depto.this.getNroLegajo();
			this.apellido       = apellido.toUpperCase();
			this.nombre         = nombre.toUpperCase();
			this.cargo          = cargo;
			this.jerarquiaCargo = Depto.this.getJerarquiaCargo(cargo);
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
		
		public int getJerarquiaCargo() {
			return jerarquiaCargo;
		}
		
		@Override
		public String toString() {
			return nroLegajo + " " + apellido + ", " + nombre + " (" + cargo.name() + ")";
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

	public class EmpleadoComparator implements Comparator<Empleado> {
		
		@Override
		public int compare(Empleado emp1, Empleado emp2) {
	        if(emp1.getJerarquiaCargo() < emp2.getJerarquiaCargo())
	            return 1;
	        else
	            return -1;
		}

	}	
	
}
