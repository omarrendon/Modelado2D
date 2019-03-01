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
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class dibujoCasa extends JFrame{
    public dibujoCasa() {
        super("CASA");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(500, 550);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public void paint(Graphics g) {
        
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.green);
        g2.setStroke(new BasicStroke(3.0f));
        Rectangle2D r = new Rectangle2D.Float(50, 200, 100, 100);
        Rectangle2D r2 = new Rectangle2D.Float(150, 200, 220, 100);
        g2.draw(r);
        g2.draw(r2);
        Line2D l = new Line2D.Float(50, 200, 120,100); 
        g2.draw(l);
        Line2D l2 = new Line2D.Float(120, 100, 150,200); 
        g2.draw(l2);
        Line2D l3 = new Line2D.Float(120, 100, 320,100); 
        g2.draw(l3);
        Line2D l4 = new Line2D.Float(370, 200, 320,100); 
        g2.draw(l4);
        Rectangle2D r3 = new Rectangle2D.Float(70, 220, 50, 80);
        g2.draw(r3);
        Rectangle2D r4 = new Rectangle2D.Float(250, 230, 50, 50);
        g2.draw(r4);
    }
}
