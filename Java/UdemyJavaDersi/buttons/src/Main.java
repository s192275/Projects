import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame();
    JButton button =new JButton("NORTH");
    JButton button2 =new JButton("EAST");
    JButton button3 =new JButton("SOUTH");
    JButton button4 =new JButton("CENTER");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(true);
    frame.setVisible(true);
    frame.setSize(400,400);

    frame.add(button, BorderLayout.NORTH);
    frame.add(button2, BorderLayout.EAST);
    frame.add(button3, BorderLayout.SOUTH);
    frame.add(button4, BorderLayout.CENTER);

    }
}
