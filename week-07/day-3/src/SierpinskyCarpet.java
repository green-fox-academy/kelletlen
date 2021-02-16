import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  private static final int LIMIT = 4;

  public static void mainDraw(Graphics graphics) {

    int x = WIDTH / 3;
    int y = HEIGHT / 3;
    int size = WIDTH / 3;

    drawSierpienskyCarpet(graphics, x, y, size, 0);

    /* graphics.fillRect(x, y, width, height);
    graphics.fillRect(x - ((width / 3) * 2), y - ((height / 3) * 2), width / 3, height / 3);
    graphics.fillRect(x + (x / 3), y - ((height / 3) * 2), width / 3, height / 3);
    graphics.fillRect((2 * width) + (width / 3), y - ((height / 3) * 2), width / 3, height / 3);
    graphics.fillRect(x - ((width / 3) * 2), y + (y / 3), width / 3, height / 3);
    graphics.fillRect(x - ((width / 3) * 2), (2 * height) + (height / 3), width / 3, height / 3);
    graphics.fillRect(x + (x / 3), (2 * height) + (height / 3), width / 3, height / 3);
    graphics.fillRect((2 * width) + (width / 3), (2 * height) + (height / 3), width / 3, height / 3);
    graphics.fillRect((2 * width) + (width / 3), height + (height / 3), width / 3, height / 3); */


  }

  public static void drawSierpienskyCarpet(Graphics graphics, int x, int y, int size, int counter) {
    if (counter > LIMIT) {
      return;
    }
    graphics.fillRect(x, y, size, size);
    drawSierpienskyCarpet(graphics, x - ((size / 3) * 2), y - ((size / 3) * 2), size / 3, counter + 1);
    drawSierpienskyCarpet(graphics, x + (size / 3), y - ((size / 3) * 2), size / 3, counter + 1);
    drawSierpienskyCarpet(graphics, x + (size + size / 3), y - ((size / 3) * 2), size / 3, counter + 1);
    drawSierpienskyCarpet(graphics, x - ((size / 3) * 2), y + (size / 3), size / 3, counter + 1);
    drawSierpienskyCarpet(graphics, x - ((size / 3) * 2), y + (size + size / 3), size / 3, counter + 1);
    drawSierpienskyCarpet(graphics, x + (size / 3), y + (size + size / 3), size / 3, counter + 1);
    drawSierpienskyCarpet(graphics, x + (size + size / 3), y + (size + size / 3), size / 3, counter + 1);
    drawSierpienskyCarpet(graphics, x + (size + size / 3), y + (size / 3), size / 3, counter + 1);

  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
