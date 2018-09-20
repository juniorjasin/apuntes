package ar.edu.ubp.das.classes;

public class Papel extends Jugada {

	@Override
	public int contra(Jugada jugada) {
		if(jugada instanceof Piedra) {
			return 1;
		}
	    else if(jugada instanceof Tijera) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PAPEL";
	}

}
