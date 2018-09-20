package ar.edu.ubp.das.formas;

public class Rectangulo extends Forma {
	
	private double lado1;
	private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1   = lado1;
        this.lado2 = lado2;
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
    public double getPerimetro() {
        return 2 * (this.lado1 + this.lado2);
    }

    @Override
    public double getArea() {
        return this.lado1 * this.lado2;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();        
        
        s.append("Rectángulo\n");
        s.append("Base: ");
        s.append(this.getLado1());            
        s.append("\n");
        s.append("Altura: ");
        s.append(this.getLado2());            
        s.append("\n");
        
        s.append("Perímetro: ");
        s.append(this.getPerimetro());
        s.append("\n");
        
        s.append("Área: ");
        s.append(this.getArea());
        s.append("\n");
        
        return s.toString();
    }

}
