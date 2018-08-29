package ar.edu.ubp.das.formas;

public abstract class Forma {
    
    protected double base;
    protected double altura;
    
    public abstract void setBase(double b);
    public abstract void setAltura(double a);
    public abstract double getBase();
    public abstract double getAltura();
    
    // forma solo deberia tener estos dos metodos
    public abstract double getPerimetro();
    public abstract double getArea();

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();        
        
        if(this.getClass() == Triangulo.class) {
            Triangulo t = Triangulo.class.cast(this);            
            s.append("Tri�ngulo\n");
            s.append("Lados: ");
            s.append(t.getLado1());
            s.append(", ");
            s.append(t.getLado2());
            s.append(", ");
            s.append(t.getBase());
            s.append("\n");
            s.append("Altura: ");
            s.append(this.getAltura());            
            s.append("\n");
        }
        else if(this.getClass() == Cuadrado.class) {
            Cuadrado c = Cuadrado.class.cast(this);            
            s.append("Cuadrado\n");
            s.append("Lado: ");
            s.append(c.getLado());
            s.append("\n");
        }
        else if(this.getClass() == Rectangulo.class) {
            s.append("Rect�ngulo\n");
            s.append("Base: ");
            s.append(this.getBase());            
            s.append("\n");
            s.append("Altura: ");
            s.append(this.getAltura());            
            s.append("\n");
        }
        
        s.append("Per�metro: ");
        s.append(this.getPerimetro());
        s.append("\n");
        
        s.append("�rea: ");
        s.append(this.getArea());
        s.append("\n");
        
        return s.toString();
    }
}
