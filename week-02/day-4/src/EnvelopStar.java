import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopStar {

    static int vonal = 16;
    static int dist = 160 / vonal;

    public static void mainDraw(Graphics graphics) {

//        quaterStar(graphics, 0, 0);
//        quaterStar(graphics, 320, 0);
//        quaterStar(graphics, 0, 320);
//        quaterStar(graphics, 320, 320);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                quaterStar(graphics, j * 320, i * 320);
            }
        }
    }

    public static void quaterStar (Graphics input, int x, int y) {
        for (int i = 1; i <= vonal; i++) {
            input.setColor(Color.green);
            input.drawLine(Math.abs(x - (dist* i)), 160, 160, Math.abs(y - (160 - (dist * i))));
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
