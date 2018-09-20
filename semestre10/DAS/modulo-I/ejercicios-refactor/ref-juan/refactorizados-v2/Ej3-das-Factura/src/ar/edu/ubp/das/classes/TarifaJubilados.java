package ar.edu.ubp.das.classes;

public class TarifaJubilados extends Tarifa {

	public TarifaJubilados(double costo) {
		super(costo);
	}
	
	@Override
	public double getDescuento() {
		return 35d;
	}
    
	@Override
	public String getTipo() {
		return "JUBILADOS";
	}
}
