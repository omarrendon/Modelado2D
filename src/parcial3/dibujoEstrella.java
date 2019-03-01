/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author omarc
 */
public class dibujoEstrella extends JFrame{
    public dibujoEstrella() {
        super("ESTRELLA");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(500, 550);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public static void dibujar(){
     JFrame x= new JFrame();
     dibujoEstrella panelEstrella = new dibujoEstrella();
       
        x.add(panelEstrella);
        x.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        x.setSize(800,900);
        x.setVisible(true);
            
        }
   protected void paintComponent(Graphics g) {
           g.drawLine(0, 350, 700, 350);//horizontal
           g.drawLine(350, 0, 350, 700);//horizontal
            int cantidadLineas=20;
            int puntInicHor = 0;
            int puntInicVert = 350;
            int puntFinalHor = 700;
            int puntFinalVert = 350;
            int distInicCentro=350;
            int avance = (int)(distInicCentro/cantidadLineas);
                 for (int i = 0; i <= cantidadLineas; i++) {
                        g.drawLine(puntInicHor, 350, 350, puntInicVert);//horizontal
                        g.drawLine(puntFinalHor, 350, 350, puntInicVert);//horizontal
                        
                        g.drawLine(puntInicHor, 350, 350, puntFinalVert);//horizontal
                        g.drawLine(puntFinalHor, 350, 350, puntFinalVert);//horizontal
                     puntInicHor+=avance;
                     puntFinalHor-=avance;
                     puntInicVert-=avance;
                     puntFinalVert+=avance;
                 }
             
    }
   public static void main(String[] args) {
        dibujar();
    }
    
}
