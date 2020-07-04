package squaregrid;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  private static final int LIMIT = 3;

  public static void mainDraw(Graphics graphics) {
    int x = WIDTH / 4;
    int y = HEIGHT / 4;
    int width = WIDTH / 2;
    int height = HEIGHT / 2;
    drawRectanglesRecursively(graphics, x, y, width, height, 0);

      /*graphics.drawRect(WIDTH/4, HEIGHT/4, WIDTH/2, HEIGHT/2);
      graphics.drawRect(WIDTH/8, HEIGHT/8, WIDTH/4, HEIGHT/4);
      graphics.drawRect((WIDTH/8)*5,HEIGHT/8, WIDTH/4, HEIGHT/4);
      graphics.drawRect(WIDTH/8, (HEIGHT/8)*5, WIDTH/4, HEIGHT/4);
      graphics.drawRect((WIDTH/8)*5, (HEIGHT/8)*5, WIDTH/4, HEIGHT/4);*/

  }

  public static void drawRectanglesRecursively(Graphics graphics, int x, int y, int width, int height, int counter) {
    if (counter > LIMIT) {
      return;
    }

    graphics.drawRect(x, y, width, height);
    drawRectanglesRecursively(graphics, x - (width / 4), y - (height / 4), width / 2, height / 2, counter + 1);
    drawRectanglesRecursively(graphics, x + ((width / 4) * 3), y - (height / 4), width / 2, height / 2, counter + 1);
    drawRectanglesRecursively(graphics, x - (width / 4), y + ((height / 4) * 3), width / 2, height / 2, counter + 1);
    drawRectanglesRecursively(graphics, x + ((width / 4) * 3), y + ((height / 4) * 3), width / 2, height / 2, counter + 1);


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

