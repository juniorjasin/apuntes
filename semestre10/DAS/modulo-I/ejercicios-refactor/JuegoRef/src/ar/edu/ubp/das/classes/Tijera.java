package ar.edu.ubp.das.classes;

public class Tijera extends Jugada {

	public int compareTo(Tijera jugada) { return 0; }
	public int compareTo(Papel jugada) { return 1; }
	public int compareTo(Piedra jugada) { return -1; }

}
