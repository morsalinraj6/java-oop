//7.26

import javax.swing.JFrame;

public class DrawRainbowTest {
    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250); // you can increase height if needed
        application.setVisible(true);
    }
}