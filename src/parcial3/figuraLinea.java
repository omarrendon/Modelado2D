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
import javax.swing.*;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class figuraLinea  extends JFrame{
    public figuraLinea() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
//      setLocationRelativeTo(null);
        this.setSize(440, 350);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true); 
        setLocationRelativeTo(null);
//        medida = new JLabel("INGRESE LA MEDIDA :");
//        medidaLinea = new JTextField(10);
//        add(medida);
//        add(medidaLinea);
    }
    public void paint (Graphics g) {
        int medida;
        medida = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA MEDIDA DE LA LINEA"));
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g; 
        g2.setColor(Color.green);
        g2.setStroke(new BasicStroke(3.0f));
        Line2D l = new Line2D.Float(50, 50, 50,medida); 
        g2.draw(l);
    } 
}
