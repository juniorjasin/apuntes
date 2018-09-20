package ar.edu.ubp.das.alumnos;

public class Matricula {
    
    private Carrera carrera;
    private Alumno alumno;

    public Matricula(Carrera carrera, Alumno alumno) {
        this.carrera = carrera;
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
}
