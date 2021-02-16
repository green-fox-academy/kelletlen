import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {

    int a = 0;
    int b = 10;
    int c = 20;


    for (int i = 0; i < 20; i++) {
      for (int j = 10; j > 0; j--) {
        int[] xPoints = {a, b, c};
        int[] yPoints = {getHeight(20), 0, getHeight(20)};
        graphics.setColor(Color.red);
        graphics.drawPolygon(xPoints, yPoints, 3);
        a = a + 20;
        b = b + 20;
        c = c + 20;
      }
      for (int k = 0; k < 20; i = i + 2) {
        int[] xPoints = {a, b, c};
        int[] yPoints = {getHeight(20), 0, getHeight(20)};
        graphics.setColor(Color.black);
        graphics.drawPolygon(xPoints, yPoints, 3);
        a = a + 20;
        b = b + 20;
        c = c + 20;

      }


    }
  }

  public static int getHeight(int size) {
    return (int) ((Math.sqrt(3) / 2) * size);
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
