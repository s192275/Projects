import javax.swing.*;
import java.awt.*;

class Button extends JFrame {
    JButton button = new JButton("First Button");
    JButton button2= new JButton("Second Button");
    Button(){
        this.setResizable(false);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBackground(Color.lightGray);
        button2.setBackground(Color.lightGray);
        button.addActionListener(
                (e) -> {
            System.out.println("You clicked the first button");
        });
        button2.addActionListener(
                (e) -> {
                    System.out.println("You clicked the second button");
        });
        this.add(button);
        this.add(button2);
        this.setVisible(true);
    }
}
