package ar.edu.ubp.das.classes;

public class Piedra extends Jugada {

	public int compareTo(Piedra jugada) { return 0; }
	public int compareTo(Tijera jugada) { return 1; }
	public int compareTo(Papel jugada) { return -1; }

}
