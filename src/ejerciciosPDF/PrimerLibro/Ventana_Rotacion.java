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

public class Ventana_Rotacion extends JFrame {

    public Ventana_Rotacion() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Ventana_Rotacion v = new Ventana_Rotacion();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int ancho = this.getSize().width;
        int largo = this.getSize().height;
        AffineTransform aT = g2.getTransform();
        aT.translate(ancho / 2, largo / 2);
        g2.transform(aT);
        aT.setToRotation(Math.PI / 4.0);
        for (int i = 0; i < 8; i++) {
            g2.drawString("MODELADO POR COMPUTADORA", 0.0f, 0.0f);
            g2.transform(aT);
        }

    }
}
