package ar.edu.ubp.das.app;

import javax.swing.JFrame;

public class Run extends JFrame {
    
	private static final long serialVersionUID = 4432209188984724131L;
    
    public Run() {
        this.setSize(400, 400);
        this.setTitle("Estrellas");
        this.add(new EstrellasPanel());     
    }
 
	public static void main(String[] args) {
         Run app = new Run();
             app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             app.setVisible(true);
    }
    
}
