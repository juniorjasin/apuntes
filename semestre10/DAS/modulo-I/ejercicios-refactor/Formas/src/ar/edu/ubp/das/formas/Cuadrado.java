package ar.edu.ubp.das.formas;

public class Cuadrado extends Forma {

    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
        return 4 * this.lado;
    }

    @Override
    public double getArea() {
        return Math.pow(this.lado, 2);
    }

}
