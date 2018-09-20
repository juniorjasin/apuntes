package ar.edu.ubp.das.empresa;

import java.util.Comparator;

public class EmpleadoComparator implements Comparator<Empleado> {
	
	@Override
	public int compare(Empleado emp1, Empleado emp2) {
        if(emp1.getCargo().getJerarquiaCargo() < emp2.getCargo().getJerarquiaCargo())
            return 1;
        else
            return -1;
	}

}
