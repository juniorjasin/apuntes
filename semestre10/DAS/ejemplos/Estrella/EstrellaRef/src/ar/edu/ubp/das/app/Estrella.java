package ar.edu.ubp.das.app;

import java.awt.Color;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Estrella {
	
	private static int puntosX[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
	private static int puntosY[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
	private static GeneralPath estrella;
    
	static {
		estrella = new GeneralPath();
		estrella.moveTo(getPuntosX()[0], getPuntosY()[0]);
		for(int j = 1; j < getPuntosX().length; j++) {
			estrella.lineTo(getPuntosX()[j], getPuntosY()[j]);
		}
		estrella.closePath();
	}
	
    public static int[] getPuntosX() {
		return puntosX;
	}

    public static int[] getPuntosY() {
		return puntosY;
	}

    public static GeneralPath getEstrella() {
		return estrella;
	}

	static Color getColor(Random random) {
		return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	}

}