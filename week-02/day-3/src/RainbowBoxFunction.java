import org.omg.PortableInterceptor.ServerRequestInfo;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(29, 0, 51), new Color (221,160,221)};

        mySquare(graphics, 40, Color.red);

        for (int i = 0; i < color.length; i++) {
           mySquare(graphics, 320 - i * 46, color[i]);

        }

    }

    public static void  mySquare(Graphics input, int squareSize, Color squareColor){
        input.setColor(squareColor);
        input.fillRect(160 - squareSize / 2, 160 - squareSize / 2, squareSize, squareSize);
    }



//    public static void drawSquare (Graphics input, int a, Color[] b) {
//        for (int i = b.length - 1; i >= 0; i--) {
//            input.setColor(b[i]);
//            input.fillRect(160 - a / 2 * i, 160 - a / 2 * i, a * i, a * i);
//        }
//    }

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