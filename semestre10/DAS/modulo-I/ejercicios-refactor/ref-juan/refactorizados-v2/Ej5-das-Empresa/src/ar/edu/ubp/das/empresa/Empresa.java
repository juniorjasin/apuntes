package ar.edu.ubp.das.empresa;

import java.util.Collections;
import java.util.LinkedList;

public class Empresa {
	
	private static LinkedList<Empleado> emp = new LinkedList<Empleado>();
	private static Empresa empresa = new Empresa();
	
	private Empresa() {}
	
	public static Empresa getInstance() {
		return empresa;
	}
	
	public void addEmp(Empleado empleado) {
	    emp.add(empleado);
    }

	public void removeEmp(int nroLegajo) {
		for (Empleado e : emp) {
			if(nroLegajo == e.getNroLegajo()) {
				emp.remove(e);
			}
		}	
	}
	
	public int getNroLegajo() {
		if(emp.size() == 0) {
			return 1;
		}		
		return Collections.max(emp).getNroLegajo() + 1;
	}
	
	@Override
	public String toString() {
		String        endLine   = System.getProperty("line.separator");
		StringBuilder infoDepto = new StringBuilder();
		Collections.sort(emp, new EmpleadoComparator());
		
        for(Empleado e : emp) {
			infoDepto.append(e).append(endLine);
		}
        return infoDepto.toString();
	}
}
