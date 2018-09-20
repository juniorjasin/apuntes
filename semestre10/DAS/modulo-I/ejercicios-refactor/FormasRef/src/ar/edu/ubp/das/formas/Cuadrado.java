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
	public double getPerimetro() {
		return 4 * this.lado;
	}

	@Override
	public double getArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("Cuadrado\n");
		s.append("Lado: ");
		s.append(this.getLado());
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
