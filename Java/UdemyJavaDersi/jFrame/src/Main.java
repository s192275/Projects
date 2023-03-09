import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("SERHATS_TEST_TEXT");
        ImageIcon icon =new ImageIcon("C:/Users/s7522/Desktop/musa ilhan.jpeg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(237, 50,250));
    }
}
