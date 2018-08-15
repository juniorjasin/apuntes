package ar.edu.ubp.das.app;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Run extends JFrame {
    
	private static final long serialVersionUID = 4432209188984724131L;
    
	static int puntosX[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
	static int puntosY[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
	
    public Run() {
        this.setSize(400, 400);
        this.setTitle("Estrellas");
        this.add(new EstrellasPanel());     
    }

    public static class Estrella {
    	static GeneralPath estrella;
        
    	static {
    		estrella = new GeneralPath();
    		estrella.moveTo(puntosX[0], puntosY[0]);
    		for(int j = 1; j < puntosX.length; j++) {
    			estrella.lineTo(puntosX[j], puntosY[j]);
    		}
    		estrella.closePath();
    	}
    	
    	static Color getColor(Random random) {
    		return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    	}
    }
    
    public class EstrellasPanel extends JPanel {
 
    	private static final long serialVersionUID = 4077680418530866990L;

		@Override
    	public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D) g;
                       g2d.translate(190, 180);

            for (int i = 1; i <= 20; i++) {
            	g2d.rotate(Math.PI / 10.0);
            	g2d.setColor(Estrella.getColor(new Random()));
            	g2d.fill(Estrella.estrella);
            }
		}
		
    }
    
    public static void main(String[] args) {
         Run app = new Run();
             app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             app.setVisible(true);
    }
    
}
