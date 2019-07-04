import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class Triangles {

    public static void mainDraw(Graphics graphics) {

        int sideSize = 10;
        int halfSize = sideSize / 2;
        int rows = 20;

//        graphics.drawLine(160, 0, 160 + rows * halfSize, rows * sideSize);
//        graphics.drawLine(160 + rows * halfSize, rows * sideSize, 160 - rows * halfSize, rows * sideSize);

        for (int i = 0; i <= rows / 2; i++) {
            graphics.drawLine(160 + (sideSize * i), 0 + (sideSize * 2 * i), (160 - rows * halfSize) + (sideSize * 2 * i), rows * sideSize);
            graphics.drawLine(160 - (sideSize * i), 0 + (sideSize * 2 * i), (160 + rows * halfSize) - (sideSize * 2 * i), rows * sideSize);
            graphics.drawLine(160 - (sideSize * i), 0 + (sideSize * 2 * i),160 + (sideSize * i),0 + (sideSize * 2 * i));
        }


        }






    //
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main (String[]args){
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