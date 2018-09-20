package ar.edu.ubp.das.formas;

public abstract class Forma {

	// forma solo deberia tener estos dos metodos
	public abstract double getPerimetro();

	public abstract double getArea();

	@Override
	public abstract String toString();
}
