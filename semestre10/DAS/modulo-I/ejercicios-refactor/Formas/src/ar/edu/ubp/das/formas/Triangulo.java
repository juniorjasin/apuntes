package ar.edu.ubp.das.formas;

public class Triangulo extends Forma {

    private double lado1, lado2;
    
    public Triangulo (double lados, double altura) {
        this(lados, altura, lados, lados);
    }

    public Triangulo (double base, double altura, double lados) {
        this(base, altura, lados, lados);
    }

    public Triangulo (double base, double altura, double lado1, double lado2) {
        this.lado1  = lado1;
        this.lado2  = lado2;
        this.base   = base;
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
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
        return this.base + this.lado1 + this.lado2;
    }

    @Override
    public double getArea() {
        return this.base * this.altura / 2;
    }

}
