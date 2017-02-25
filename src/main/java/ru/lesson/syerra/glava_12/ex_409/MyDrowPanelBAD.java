package syerraBeyts.glava_12.ex_409;

import javax.swing.*;
import java.awt.*;

/**
 * виджет для рисования
 * @autor irinaff
 * @since 30.01.2017
 **/

public class MyDrowPanelBAD extends JPanel{
    public void paintComponent (Graphics g) {
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(
                70,70,startColor,
                150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
        }
}
