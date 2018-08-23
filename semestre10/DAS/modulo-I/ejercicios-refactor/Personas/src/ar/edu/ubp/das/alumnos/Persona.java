package ar.edu.ubp.das.alumnos;

public class Persona {

    private int nroPersona;
    protected int nroLegAlumno;
    protected int nroLegDocente;
    
    private String apellido;
    private String nombre;
    
    private TipoDocumento tipoDocumento;

    public Persona() { }
    
    public Persona(int nroPersona, int nroLegAlumno, int nroLegDocente, int nroLegPersonal, String apellido, String nombre, TipoDocumento tipoDocumento) {
        this.nroPersona = nroPersona;
        this.nroLegAlumno = nroLegAlumno;
        this.nroLegDocente = nroLegDocente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroPersona() {
        return nroPersona;
    }

    public void setNroPersona(int nroPersona) {
        this.nroPersona = nroPersona;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
}
