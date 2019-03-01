/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

//import static Claseeeesss.ventanaFiguta.bandera;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Luis
 */
public class PanelEstrella extends JPanel {
     @Override
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
}
