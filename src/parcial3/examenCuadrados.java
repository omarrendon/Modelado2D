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
import java.awt.Rectangle;
import javax.swing.*;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class examenCuadrados extends JFrame{
    public static int n1;
    public static int modulo1;
    public static Graphics2D g4;
    
    public examenCuadrados() {
        super("EXAMEN!!");
        Container cl = getContentPane();
        cl.setLayout(null);
        this.setSize(550, 550);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //MENSAJES DONDE SE CAPTURAN LOS DATOS
        String a = JOptionPane.showInputDialog(null,"TAMAÑO DE LA MATRIZ", "INGRESE LOS NUMEROS", JOptionPane.WARNING_MESSAGE);
        String b = JOptionPane.showInputDialog(null,"NUMERO DEL MODULO", "INGRESE LOS NUMEROS", JOptionPane.WARNING_MESSAGE);
        //CASTEO DE VARIABLES D ELOS MENSAJES
        n1 = Integer.parseInt(a);
        modulo1 = Integer.parseInt(b);
        super.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        int p = 40, k = 50;
        int n = n1;
        int aumento = 0;
        int modulo = modulo1;

        for (int i = 0; i < n; i++) {
            k += 22;
            for (int j = 0; j < n; j++) {
                Graphics2D g3 = (Graphics2D) g;
                g3.setColor(Color.black);
                g3.setStroke(new BasicStroke(3.0f));
                Rectangle r1 = new Rectangle(p + (j * 20), k, 20, 20);
                g3.draw(r1);
                
                System.out.println("" + aumento % modulo);
                if (aumento % modulo == 0) {

                    g3.setColor(Color.blue);
                    g3.fill(r1);
                }
                aumento += 1;
            }
        }
    } 
}
