package ar.edu.ubp.das.formas;

public class Rectangulo extends Forma {

    public Rectangulo(double lado1, double lado2) {
        this.base   = lado1;
        this.altura = lado2;        
    }
        
    @Override
    public void setBase(double b) {
        this.base = b;
    }

    @Override
    public void setAltura(double a) {
        this.altura = a;
    }

    @Override
    public double getBase() {
        return this.base;
    }

    @Override
    public double getAltura() {
        return this.altura;
    }
    
    @Override
    public double getPerimetro() {
        return 2 * (this.base + this.altura);
    }

    @Override
    public double getArea() {
        return this.base * this.altura;
    }

}
