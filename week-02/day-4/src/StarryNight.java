import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 50; i++) {
      drawRandomRectangle(graphics);
    }


    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)


  }

  public static void drawRandomRectangle(Graphics graphics) {
    int x = (int) (Math.random() * 320);
    int y = (int) (Math.random() * 320);
    int size = (int) (Math.random() * 5);
    int r = 105 + (int) (Math.random() * 90);
    int g = 105 + (int) (Math.random() * 90);
    int b = 105 + (int) (Math.random() * 90);
    graphics.setColor(new Color(r, b, g, 150));
    graphics.fillRect(x, y, size, size);

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
      this.setBackground(Color.black);
      mainDraw(graphics);
    }
  }
}
