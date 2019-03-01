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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Omar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ventana_Shear extends JFrame {

    public Ventana_Shear() {
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Ventana_Shear v = new Ventana_Shear();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform aT= g2.getTransform();
        aT.translate(100,100);
        g2.transform(aT);
        aT.shear(20.0,-3.0);
        for(int i=0;i<2;i++){ 
            g2.drawString("Java2D",0.0f,0.0f);
            g2.transform(aT); 
            g2.transform(aT);
        }


    }
}
