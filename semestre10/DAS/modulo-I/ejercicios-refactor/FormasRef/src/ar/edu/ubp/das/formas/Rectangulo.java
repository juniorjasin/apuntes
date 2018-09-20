package ar.edu.ubp.das.formas;

public class Rectangulo extends Forma {

	double base;
	double altura;

	// nombre de params no esta muy bueuno, pero esta bien base y altura aca
	public Rectangulo(double lado1, double lado2) {
		this.base = lado1;
		this.altura = lado2;
	}

	public void setBase(double b) {
		this.base = b;
	}

	public void setAltura(double a) {
		this.altura = a;
	}

	public double getBase() {
		return this.base;
	}

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

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("Rect�ngulo\n");
		s.append("Base: ");
		s.append(this.getBase());
		s.append("\n");
		s.append("Altura: ");
		s.append(this.getAltura());

		s.append("\n");
		s.append("Per�metro: ");
		s.append(this.getPerimetro());
		s.append("\n");
		s.append("�rea: ");
		s.append(this.getArea());
		s.append("\n");

		return s.toString();

	}

}
