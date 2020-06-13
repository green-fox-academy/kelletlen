import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Rainbow {
  public static void mainDraw(Graphics g){
    int rainbowWidth = 100;

    for (int i = 0; i < rainbowWidth; i++) {
      float blue = i / (float)rainbowWidth * 255;
      float red = (1 - i / (float)rainbowWidth) * 255;

      g.setColor(new Color((int)red, 0, (int)blue));
      g.drawArc(i, HEIGHT / 2 + i, WIDTH - 2 * i, HEIGHT - 2 * i, 0, 180);
    }


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Rainbow");
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
