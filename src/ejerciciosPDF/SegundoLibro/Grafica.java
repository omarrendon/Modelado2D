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

public class Grafica extends JFrame {

    public Grafica() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Grafica v = new Grafica();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(3.0f));
        CubicCurve2D c = new CubicCurve2D.Float(40.0f, 60.0f, 60.0f, 120.0f, 140.0f, 130.0f, 150.0f, 210.0f);
        g2.draw(c);
        g2.setColor(Color.red);
        g2.draw(new Rectangle2D.Float(40.0f, 60.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(60.0f, 120.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(140.0f, 130.0f, 1.0f, 1.0f));
        g2.draw(new Rectangle2D.Float(150.0f, 210.0f, 1.0f, 1.0f));
    }
}
