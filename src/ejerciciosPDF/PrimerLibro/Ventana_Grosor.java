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

public class Ventana_Grosor extends JFrame {

    public Ventana_Grosor() {
        super("Prueba de Ventana 02jhj");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Ventana_Grosor v = new Ventana_Grosor();
    }
    public void paint (Graphics g) { 
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D r2 = new Rectangle2D.Float(75, 50, 100, 25);
        Stroke pincel = new BasicStroke(4.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2.setStroke(pincel);
        g2.draw(r2);
    }
}
