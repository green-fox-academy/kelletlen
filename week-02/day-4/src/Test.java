import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Test {
  public static void mainDraw(Graphics graphics) {
    int x = 10;
    int y = 10;
    int size = 10;

    for (int i = 0; i < 5; i++) {
      drawPurpleRectangles(x, y, size, graphics);
      x = x + (i * 10);
      y = y + 10;
      size = (x + 10) - x;
    }
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

  }

  public static void drawPurpleRectangles(int x, int y, int size, Graphics g) {
    g.setColor(Color.MAGENTA);
    g.fillRect(x, y, size, size);
    g.setColor(Color.black);
    g.drawRect(x, y, size, size);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    PurpleSteps3d.ImagePanel panel = new PurpleSteps3d.ImagePanel();
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

