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

public class Ventana_blanca extends JFrame {

    public Ventana_blanca() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
       
    }
    public static void main(String[] args) {
        Ventana_blanca v = new Ventana_blanca();
    }
    public void paint (Graphics g)
    {
       RenderingHints rh=new RenderingHints( 
       RenderingHints.KEY_ANTIALIASING, 
       RenderingHints.VALUE_ANTIALIAS_OFF); 
       rh.put(RenderingHints.KEY_RENDERING,
       RenderingHints.VALUE_RENDER_SPEED); 
       Graphics2D g2 =(Graphics2D)g;
       g2.setRenderingHints(rh);
    } 
}