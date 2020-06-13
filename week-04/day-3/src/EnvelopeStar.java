import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {

    int x1 = 160;
    int y1 = 160;
    int x2 = 160;
    int y2 = 0;

    for ( int i = 0; i < 16; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(x1, y1, x2, y2);
      x1 = x1 + 10;
      y2 = y2 + 10;
    }

    int a1 = 160;
    int b1 = 160;
    int a2 = 160;
    int b2 = 0;

    for (int i = 0; i < 16 ; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(a1, b1, a2, b2);
      a1 = a1 - 10;
      b2 = b2 + 10;
    }

    int c1 = 160;
    int d1 = 160;
    int c2 = 160;
    int d2 = 320;

    for (int i = 0; i < 16; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(c1, d1, c2, d2);
      c1 = c1 - 10;
      d2 = d2 - 10;

    }

    int e1 = 160;
    int f1 = 160;
    int e2 = 160;
    int f2 = 320;

    for (int i = 0; i < 16 ; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(e1, f1, e2, f2);
      e1 = e1 + 10;
      f2 = f2 -10;
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
