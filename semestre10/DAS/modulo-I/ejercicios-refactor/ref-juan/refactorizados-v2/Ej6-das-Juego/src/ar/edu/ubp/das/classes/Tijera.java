package ar.edu.ubp.das.classes;

public class Tijera extends Jugada {

	@Override
	public int contra(Jugada jugada) {
		System.out.println(jugada.getClass());
		if(jugada instanceof Papel) {
			return 1;
		}
	    else if(jugada instanceof Piedra) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TIJERA";
	}

}
