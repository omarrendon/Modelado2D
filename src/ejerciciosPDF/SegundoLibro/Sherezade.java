/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPDF.SegundoLibro;
/**
 *
 * @author Omar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sherezade extends JFrame {

    public Sherezade() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Sherezade v = new Sherezade();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
// Dibujo del cielo. Este es el fondo.
// Se ha usado un gradiente que va desde el azul al negro
        GradientPaint gp1 = new GradientPaint(10.0f,
                125.0f, Color.blue, 250.0f, 125.0f, Color.black);
        Rectangle2D r = new Rectangle2D.Double(0.0, 0.0,
                250.0, 250.0);
        g2.setPaint(gp1);
        g2.fill(r);
        GradientPaint gp2 = new GradientPaint(50.0f,
                50.0f, Color.yellow, 300.0f, 50.0f, Color.darkGray);
        g2.setPaint(gp2);
        Ellipse2D e1 = new Ellipse2D.Double(70.0, 100.0,
                80.0, 80.0);
        Ellipse2D e2 = new Ellipse2D.Double(100.0, 100.0,
                80.0, 80.0);
        Area a1 = new Area(e1);
        Area a2 = new Area(e2);
        a1.subtract(a2);
        g2.fill(a1);
    }
}
