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
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class figuraRectangulo extends JFrame{
    public figuraRectangulo() {
        super("rectangulo"); 
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(450, 450);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
        setLocationRelativeTo(null);
    }
    public void paint (Graphics g)
    {
       int lado, ancho;
       lado = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA MEDIDA DE LARGO"));
       ancho = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA MEDIDA DE ANCHO"));
       super.paint(g);
       Graphics2D g2 = (Graphics2D)g; // Creacióndel Rectangle2D 
       g2.setColor(Color.red); 
       g2.setStroke(new BasicStroke(3.0f));
       Rectangle2D r = new Rectangle2D.Float(100, 75, lado, ancho); 
       g2.draw(r); 
    } 
}
