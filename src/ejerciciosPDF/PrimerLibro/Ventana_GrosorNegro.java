/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPDF.PrimerLibro;

/**
 *
 * @author Omar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ventana_GrosorNegro extends JFrame {

    public Ventana_GrosorNegro() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Ventana_GrosorNegro v = new Ventana_GrosorNegro();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D r2 = new Rectangle2D.Float(75, 125, 100, 25);
        Stroke pincel = new BasicStroke(19.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND);
        g2.setStroke(pincel);
        g2.draw(r2);
    }
}
