package ar.edu.ubp.das.app;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Run extends JFrame {

	private static final long serialVersionUID = 4432209188984724131L;
	// podria ser mas polimorfico
	private LinkedList<Punto> puntos;

	public Run() {
		this.puntos = new LinkedList<Punto>();

		this.setSize(300, 300);
		this.setTitle("Dibujar Puntos");

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				// cambiar esto a variable de clase
				Graphics2D g = Graphics2D.class.cast(Run.this.getGraphics());

				Punto p = new Punto();
				p.setX(evt.getX());
				p.setY(evt.getY());

				Run.this.puntos.add(p);

				Color c = Run.this.getColor(p);

				int size = Run.this.puntos.size();
				if (size > 1) {
					Run.this.drawLinea(g, Run.this.puntos.get(size - 1), Run.this.puntos.get(size - 2), c);
				}
				Run.this.drawPunto(g, p, c);
			}
		});
	}

	public Color getColor(Punto p) {
		// Intimidad inadecuada
		if (p.getX() % 2 == 0 && p.getY() % 2 == 0) {
			return Color.RED;
		} else if (p.getX() % 2 != 0 && p.getY() % 2 == 0) {
			return Color.YELLOW;
		} else if (p.getX() % 2 == 0 && p.getY() % 2 != 0) {
			return Color.GREEN;
		}
		return Color.BLUE;
	}

	public void drawPunto(Graphics2D g, Punto p, Color c) {
		g.setColor(c);
		g.setBackground(c);
		g.drawRect(p.getX(), p.getY(), 1, 1);
	}

	public void drawLinea(Graphics2D g, Punto p1, Punto p2, Color c) {
		g.setColor(c);
		g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	public static void main(String[] args) {
		Run app = new Run();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}

}
