import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

    graphics.setColor(new Color(200, 200, 0, 150));
    graphics.drawLine(100, 100, 220, 100);

    graphics.setColor(new Color(204, 153, 255, 150));
    graphics.drawLine(100, 220, 220, 220);

    graphics.setColor(new Color(255, 133, 51, 150));
    graphics.drawLine(100, 100, 100, 220);

    graphics.setColor(new Color(0, 102, 255, 150));
    graphics.drawLine(220, 220, 220, 100);


    // Draw a box that has different colored lines on each edge.


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
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
