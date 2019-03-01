/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPDF.TercerLibro;
/**
 *
 * @author Omar
 */
import java.awt.*;
import javax.swing.*;

public class ShowColors extends JFrame {

    public ShowColors() {
        super("Using colors");

        setSize(400, 130);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(255, 0, 0));
        g.fillRect(25, 25, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 40);
        g.setColor(new Color(0.0f, 1.0f, 0.0f));
        g.fillRect(25, 50, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 65);

        // set new drawing color using static Color objects
        g.setColor(Color.BLUE);
        g.fillRect(25, 75, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 90);

        // display individual RGB values
        Color color = Color.MAGENTA;
        g.setColor(color);
        g.fillRect(25, 100, 100, 20);
        g.drawString("RGB values: " + color.getRed() + ", "
                + color.getGreen() + ", " + color.getBlue(), 130, 115);

    }

    public static void main(String args[]) {
        ShowColors application = new ShowColors();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
