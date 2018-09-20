package ar.edu.ubp.das.alumnos;

public class Carrera {
	 
    private String CodCarrera;
    private String nomCarrera;
    private String planCarrera;
    private String duracionCarrera;
    private String modalidadCarrera;

    public Carrera() { }

    public Carrera(String CodCarrera, String nomCarrera, String planCarrera, String duracionCarrera, String modalidadCarrera) {
        this.CodCarrera = CodCarrera;
        this.nomCarrera = nomCarrera;
        this.planCarrera = planCarrera;
        this.duracionCarrera = duracionCarrera;
        this.modalidadCarrera = modalidadCarrera;
    }
    
    public String getCodCarrera() {
        return CodCarrera;
    }

    public void setCodCarrera(String CodCarrera) {
        this.CodCarrera = CodCarrera;
    }

    public String getDuracionCarrera() {
        return duracionCarrera;
    }

    public void setDuracionCarrera(String duracionCarrera) {
        this.duracionCarrera = duracionCarrera;
    }

    public String getModalidadCarrera() {
        return modalidadCarrera;
    }

    public void setModalidadCarrera(String modalidadCarrera) {
        this.modalidadCarrera = modalidadCarrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public String getPlanCarrera() {
        return planCarrera;
    }

    public void setPlanCarrera(String planCarrera) {
        this.planCarrera = planCarrera;
    }
        
}
