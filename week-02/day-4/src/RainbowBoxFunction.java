import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.orange;
import static java.awt.Color.red;
import static java.awt.Color.yellow;


import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

        ArrayList<Color> Colors = new ArrayList <>();
        Colors.add(0, red);
        Colors.add(1, orange);
        Colors.add(2, yellow);
        Colors.add(3, green);
        Colors.add(4, blue);
        Colors.add (5, new Color(10,0,130,150));
        Colors.add (6, new Color(75,10,75,150));

        int a = 320;
        for (int i = 0; i < Colors.size(); i++) {
            centerBox(a, graphics, Colors.get(i));
            a -= 40;
        }




        //centerBox(a, graphics, red);


        }



        // String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        // centerBox(a, graphics, Color.green);
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).


    public static void centerBox (int a, Graphics g, Color c) {

        g.setColor(c);
        g.fillRect(WIDTH/2 - (a/2), HEIGHT/2 - (a/2), a, a);



    }

        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main (String[]args){
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ImagePanel panel = new ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.pack();
        }

        static class ImagePanel extends JPanel {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                mainDraw(graphics);
            }
        }

    }