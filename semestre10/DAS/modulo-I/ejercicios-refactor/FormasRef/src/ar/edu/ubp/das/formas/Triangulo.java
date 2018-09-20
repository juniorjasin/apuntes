package ar.edu.ubp.das.formas;

public class Triangulo extends Forma {

	// los nombres no son representativos
	private double lado1, lado2, lado3, altura;

	// este constructor no se usa
	public Triangulo(double lados, double altura) {
		this(lados, altura, lados, lados);
	}

	// este constructor no se usa
	public Triangulo(double base, double altura, double lados) {
		this(base, altura, lados, lados);
	}

	// base y altura no son algo que represente a triangulo
	public Triangulo(double lado3, double altura, double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
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

	public void setLado2(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double getPerimetro() {
		return this.lado3 + this.lado1 + this.lado2;
	}

	@Override
	public double getArea() {
		return this.lado3 * this.altura / 2;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("Tri�ngulo\n");
		s.append("Lados: ");
		s.append(this.getLado1());
		s.append(", ");
		s.append(this.getLado2());
		s.append(", ");
		s.append(this.getLado3());
		s.append("\n");
		s.append("Altura: ");
		s.append(this.getAltura());
		s.append("\n");

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
