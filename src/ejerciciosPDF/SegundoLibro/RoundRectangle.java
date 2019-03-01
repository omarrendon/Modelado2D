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

public class RoundRectangle extends JFrame {

    public RoundRectangle() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        RoundRectangle v = new RoundRectangle();
    }
    public void paint (Graphics g)
    {
       super.paint(g); Graphics2D g2 = (Graphics2D)g; // Dibujodelrectánguloredondeado 
       g2.setColor(Color.pink);
       g2.setStroke(new BasicStroke(3.0f)); 
       RoundRectangle2D q = new RoundRectangle2D.Float( 50.0f, 50.0f, 100.0f, 150.0f, 25.0f, 25.0f); 
       g2.draw(q); 
    } 
}