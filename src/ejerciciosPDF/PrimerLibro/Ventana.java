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

public class Ventana extends JFrame {

    public Ventana() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
    public void paint (Graphics g)
    {
        Rectangle2D r2 = new Rectangle2D.Float(75,50,100,25);
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(r2); 
    } 
}


