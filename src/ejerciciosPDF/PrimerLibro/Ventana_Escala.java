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

public class Ventana_Escala extends JFrame {

    public Ventana_Escala() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Ventana_Escala v = new Ventana_Escala();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform aT= g2.getTransform();
        aT.translate(10,170);
        g2.transform(aT);
        aT.setToScale(2.5f,2.5f);
        for(int i=0;i<3;i++){ 
            g2.drawString("Java2D",0.0f,0.0f);
            g2.transform(aT);
            g2.transform(aT);
        }


    }
}

