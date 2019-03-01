/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class figuraCirculo extends JFrame{
    public figuraCirculo() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(550, 550);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
        setLocationRelativeTo(null);
    }
    public void paint (Graphics g) {
      int val1, val2;
      val1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA MEDIDA 1"));
      val2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA MEDIDA 2"));
      super.paint(g);
      Graphics2D g2 = (Graphics2D)g;
      g2.setColor(Color.red);
      g2.setStroke(new BasicStroke(3.0f));
      Ellipse2D e = new 
      Ellipse2D.Float(100,75,val1,val2); 
      g2.draw(e); 
    }
}
