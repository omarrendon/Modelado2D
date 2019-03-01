/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class figuraCuadrado extends JFrame {
    public figuraCuadrado() {
        super("Ventana cuadrado");
        Container cl = getContentPane();
        cl.setLayout(null);
        this.setSize(450, 250);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public void paint(Graphics g) {
        int medida;
        medida = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA MEDIDA DE LA LINEA"));
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.green);
        g2.setStroke(new BasicStroke(3.0f));
        Rectangle2D r = new Rectangle2D.Float(100, 100, medida, medida);
        g2.draw(r);
    }
}
