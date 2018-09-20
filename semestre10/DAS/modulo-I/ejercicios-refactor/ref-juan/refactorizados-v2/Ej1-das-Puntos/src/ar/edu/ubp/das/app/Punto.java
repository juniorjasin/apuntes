package ar.edu.ubp.das.app;

import java.awt.Color;

public class Punto {

    private int x;
    private int y;
    
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Color getColor() {
        if(getX() % 2 == 0 && getY() % 2 == 0) {
            return Color.RED;
        }
        else if(getX() % 2 != 0 && getY() % 2 == 0) {
            return Color.YELLOW;
        }    
        else if(getX() % 2 == 0 && getY() % 2 != 0) {
            return Color.GREEN;
        }    
        return Color.BLUE;
    }
}
