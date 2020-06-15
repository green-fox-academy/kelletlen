import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LovelyDrawing {
  public static void mainDraw(Graphics graphics) {
    int triangleSize = 400;
    int numberOfTriangles = 50;
    int horizontalCenter = WIDTH / 2;
    int sizeChange = triangleSize / numberOfTriangles;

    for (int i = 0; i < numberOfTriangles; i++) {
      triangleSize = triangleSize - sizeChange;
      int halfSize = triangleSize / 2;
      int[] xSequence = {horizontalCenter - halfSize, horizontalCenter, horizontalCenter + halfSize};
      int[] ySequence = {HEIGHT, HEIGHT - getHeight(triangleSize), HEIGHT};
      graphics.setColor(getRandomColor());
      graphics.fillPolygon(xSequence, ySequence, xSequence.length);
    }
  }

  public static int getHeight(int size) {
    return (int) ((Math.sqrt(3) / 2) * size);
  }

  public static Color getRandomColor() {
    Random random = new Random();
    int maxValue = 256;
    return new Color(random.nextInt(maxValue), random.nextInt(maxValue), random.nextInt(maxValue));
  }

  //region Pre-defined code
  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Lovely Drawing");
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
  //endregion
}
