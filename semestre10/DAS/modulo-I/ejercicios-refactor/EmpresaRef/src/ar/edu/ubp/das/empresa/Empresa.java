package ar.edu.ubp.das.empresa;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Empresa {

	private static Empresa empresa;
	private LinkedList<Empleado> empleados = new LinkedList<Empleado>();;
	private int nroLegajo = 0;

	private Empresa() {
	}

	public static Empresa getInst() {
		if (empresa == null) {
			empresa = new Empresa();
		}
		return empresa;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	public void addEmp(String apellido, String nombre, Cargo cargo) {
		this.nroLegajo++;
		Empleado e = new Empleado(apellido, nombre, cargo, this.nroLegajo);
		empleados.add(e);
	}

	public void removeEmp(int nroLegajo) {
		for (Empleado e : empleados) {
			if (nroLegajo == e.getNroLegajo()) {
				empleados.remove(e);
				this.nroLegajo--;
			}
		}
	}

	@Override
	public String toString() {
		String endLine = System.getProperty("line.separator");
		StringBuilder infoDepto = new StringBuilder();

		Collections.sort(this.empleados, new EmpleadoComparator());

		for (Empleado e : this.empleados) {
			infoDepto.append(e).append(endLine);
			infoDepto.append("DEPTO: ").append(e.getDepto().getNombre()).append(endLine);
		}
		return infoDepto.toString();
	}

	public class EmpleadoComparator implements Comparator<Empleado> {

		@Override
		public int compare(Empleado emp1, Empleado emp2) {
			if (emp1.getJerarquiaCargo() < emp2.getJerarquiaCargo())
				return 1;
			else
				return -1;
		}

	}

}
