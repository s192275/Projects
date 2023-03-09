import javax.swing.*;

public class NewWindow {
    JFrame frame =new JFrame();
    JLabel label = new JLabel();

    NewWindow () {
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Congrats!");

        label.setText("You've opened a new window !");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        frame.setVisible(true);
        frame.add(label);
    }
}
