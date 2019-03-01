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
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class dibujoCarro extends JFrame{
    public dibujoCarro() {
        super("CARRO");
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
        Rectangle2D r = new Rectangle2D.Float(150, 200, 200, 70);
        g2.draw(r); 
        Rectangle2D r2 = new Rectangle2D.Float(230, 130, 100, 70);
        g2.draw(r2);
        Ellipse2D e = new Ellipse2D.Float(190,270,50,50); 
        g2.draw(e);
        Ellipse2D e2 = new Ellipse2D.Float(280,270,50,50); 
        g2.draw(e2);
        Rectangle2D r3 = new Rectangle2D.Float(250, 140, 50, 60);
        g2.draw(r3);
        Rectangle2D r4 = new Rectangle2D.Float(230, 220, 50, 10);
        g2.draw(r4);
        Ellipse2D e3 = new Ellipse2D.Float(260,150,40,40); 
        g2.draw(e3);
        
    }
}
