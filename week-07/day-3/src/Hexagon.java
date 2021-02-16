import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  public static void mainDraw(Graphics graphics) {
    int xpoints[] = {WIDTH / 4, (WIDTH / 4) * 3, WIDTH, (WIDTH / 4) * 3, WIDTH / 4, 0};
    int ypoints[] = {0, 0, HEIGHT / 2, HEIGHT, HEIGHT, HEIGHT / 2};
    int npoints = 6;
    graphics.drawPolygon(xpoints, ypoints, npoints);


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
