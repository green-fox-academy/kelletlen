import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    // graphics.drawLine(20, 320, 0, 0);
    int x1 = 20;
    int y1 = 320;
    int x2 = 0;
    int y2 = 0;

    for (int i = 0; i < 16; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(x1, y1, x2, y2);
      x1 = x1 + 20;
      y2 = y2 + 20;
    }

    int a1 = 320;
    int b1 = 0;
    int a2 = 320;
    int b2 = 320;

    for (int i = 0; i < 16; i++) {
      graphics.setColor(Color.magenta);
      graphics.drawLine(a1, b1, a2, b2);
      a1 = a1 - 20;
      b2 = b2 - 20;
    }


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

