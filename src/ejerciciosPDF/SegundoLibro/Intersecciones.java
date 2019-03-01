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

public class Intersecciones extends JFrame {

    public Intersecciones() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Intersecciones v = new Intersecciones();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(50.0f, 50.0f,
                Color.blue, 200.0f, 50.0f, Color.red);
        g2.setPaint(gp);
        Ellipse2D e1 = new Ellipse2D.Double(50.0, 50.0,
                80.0, 80.0);
        Ellipse2D e2 = new Ellipse2D.Double(100.0, 50.0,
                80.0, 80.0);
        Area a1 = new Area(e1);
        Area a2 = new Area(e2);
//a1.add(a2);
// a1.intersect(a2);
// a1.subtract(a2);
        a1.exclusiveOr(a2);
        g2.fill(a1);
    }
}
