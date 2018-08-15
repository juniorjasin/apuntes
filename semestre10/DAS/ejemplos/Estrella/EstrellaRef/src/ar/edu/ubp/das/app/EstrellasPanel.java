package ar.edu.ubp.das.app;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

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
        	g2d.fill(Estrella.getEstrella());
        }
	}
}