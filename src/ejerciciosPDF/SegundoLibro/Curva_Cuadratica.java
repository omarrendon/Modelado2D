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

public class Curva_Cuadratica extends JFrame {

    public Curva_Cuadratica() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Curva_Cuadratica v = new Curva_Cuadratica();
    }
    public void paint (Graphics g)
    {
      super.paint(g);
      Graphics2D g2 = (Graphics2D)g; 
      g2.setColor(Color.blue);
      g2.setStroke(new BasicStroke(3.0f));
      QuadCurve2D q = new QuadCurve2D.Float( 40.0f, 70.0f, 40.0f, 170.0f, 190.0f, 220.0f); 
      g2.draw(q);
      g2.setColor(Color.red);
      g2.draw(new Rectangle2D.Float(40.0f, 70.0f, 1.0f, 1.0f)); 
      g2.draw(new Rectangle2D.Float(40.0f, 170.0f, 1.0f, 1.0f)); 
      g2.draw(new Rectangle2D.Float(190.0f, 220.0f, 1.0f, 1.0f));
    } 
}
