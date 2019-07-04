import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

//        for (int i = 1; i <16; i++) {
//            graphics.setColor(Color.green);
//            graphics.drawLine(0, 20 * i, 20 * i, 320);
//            graphics.setColor(Color.red);
//            graphics.drawLine(20 * i, 0, 320, 20 *i);
//        }

        int part = 64;
        int line = 16;
        double sqrRoot = Math.sqrt(part);


        for (int i = 0; i < sqrRoot; i++) {
            for (int j = 0; j < sqrRoot; j++) {
                canvasParts(graphics,((int)(part/(sqrRoot/2))), line, (int)(j * (320/part*sqrRoot)), (int)(i * (320/part*sqrRoot)));
            }
        }
    }

    public static void  canvasParts (Graphics input, int parts, int lines, int x, int y) {
        int area = 320 / (parts / 2);
        for (int i = 1; i < lines; i++) {
            input.setColor(Color.green);
            input.drawLine(x,y + (area / lines * i), x +(area / lines * i), y + area);
            input.setColor(Color.red);
            input.drawLine((area / lines * i) + x, y, area + x, y + (area / lines * i));
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