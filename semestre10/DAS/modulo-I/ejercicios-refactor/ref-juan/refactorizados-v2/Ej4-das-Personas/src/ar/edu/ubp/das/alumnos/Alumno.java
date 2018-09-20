package ar.edu.ubp.das.alumnos;

public class Alumno extends Persona {
	
	private int nroLegAlumno;
	
	public Alumno(int nroPersona, int nroLegAlumno, int nroLegDocente, int nroLegPersonal, String apellido, String nombre, TipoDocumento tipoDocumento, Cargo cargo, Carrera carrera) {
        super(nroPersona, nroLegPersonal, apellido, nombre, tipoDocumento);
        this.nroLegAlumno = nroLegAlumno;
    }
    
    public int getNroLegAlumno() {
        return nroLegAlumno;
    }

    public void setNroLegAlumno(int nroLegAlumno) {
        this.nroLegAlumno = nroLegAlumno;
    }
    
}
