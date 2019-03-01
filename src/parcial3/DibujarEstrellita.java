/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

import javax.swing.JFrame;

/**
 *
 * @author Luis
 */
public class DibujarEstrellita {
     public static void dibujar(){
     JFrame x= new JFrame();
     PanelEstrella panelEstrella = new PanelEstrella();
       
        x.add(panelEstrella);
        x.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        x.setSize(800,900);
        x.setVisible(true);
            
        }
        public static void main(String[] args) {
        dibujar();
    }
}
