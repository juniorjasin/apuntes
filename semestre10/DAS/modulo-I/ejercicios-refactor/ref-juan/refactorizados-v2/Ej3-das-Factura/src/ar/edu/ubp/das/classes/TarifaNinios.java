package ar.edu.ubp.das.classes;

public class TarifaNinios extends Tarifa {

	public TarifaNinios(double costo) {
		super(costo);
	}
	
	@Override
	public double getDescuento() {
		return 25.5d;
	}
	
	@Override
	public String getTipo() {
		return "NIÑOS";
	}

}
