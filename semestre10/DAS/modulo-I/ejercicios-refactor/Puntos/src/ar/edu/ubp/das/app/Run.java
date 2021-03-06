package ar.edu.ubp.das.app;

import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Run extends JFrame {

	private static final long serialVersionUID = 4432209188984724131L;
	// podria ser mas polimorfico
	private LinkedList<Punto> puntos;
	private Graphics2D g = Graphics2D.class.cast(Run.this.getGraphics());

	public Run() {
		this.puntos = new LinkedList<Punto>();

		this.setSize(300, 300);
		this.setTitle("Dibujar Puntos");

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {

				Punto p = new Punto();
				p.setX(evt.getX());
				p.setY(evt.getY());

				Run.this.puntos.add(p);

				int size = Run.this.puntos.size();
				if (size > 1) {
					Run.this.drawLinea(Run.this.puntos.get(size - 1), Run.this.puntos.get(size - 2));
				}
				Run.this.drawPunto(p);
			}
		});
	}

	public void drawPunto(Punto p) {

		try {
			this.g.setColor(p.getColor());

		} catch (Exception e) {
			System.out.println("salto:" + e.toString());
		}

		this.g.setBackground(p.getColor());
		this.g.drawRect(p.getX(), p.getY(), 1, 1);
	}

	public void drawLinea(Punto p1, Punto p2) {
		this.g.setColor(p2.getColor());
		this.g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	public static void main(String[] args) {
		Run app = new Run();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}

}
