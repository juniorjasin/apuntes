package ar.edu.ubp.das.classes;

import java.lang.reflect.InvocationTargetException;

public class Juego {

	public static void main(String args[]) {
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador();
		boolean termino = false;

		int valor;
		Jugada selJ1, selJ2;
		Jugada resultados[] = { new Piedra(), new Papel(), new Tijera() };

		do {
			System.out.println("Elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
			valor = Consola.readInt();
			while (!(valor >= 0 && valor < 3)) {
				System.out.print("La opci�n no es v�lida. Recuerda, elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
				valor = Consola.readInt();
			}

			selJ1 = resultados[valor];
			int i = (int) (Math.random() * 3);
			selJ2 = resultados[i];

			System.out.println("Jugador 1: " + selJ1.getClass().getSimpleName());
			System.out.println("Jugador 2: " + selJ2.getClass().getSimpleName());

			java.lang.reflect.Method method;
			try {
				method = selJ1.getClass().getMethod("compareTo", selJ2.getClass());
				int resultado = (int) method.invoke(selJ1, selJ2);

				if (resultado == -1) {
					j2.g++;
					System.out.println("Perdiste");
				} else if (resultado == 1) {
					j1.g++;
					System.out.println("Ganaste");
				} else {
					System.out.println("Empate");
				}

			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}

			System.out.println();
			System.out.println("Ganados Jugador 1: " + j1.getGanados());
			System.out.println("Ganados Jugador 2: " + j2.getGanados());

			if (j1.getGanados() == 3 || j2.getGanados() == 3) {
				termino = true;
				System.out.println(j1.getGanados() == 3 ? "GANASTE! :)" : "PERDISTE! :(");
			}
			System.out.println();
		} while (!termino);
	}

}
