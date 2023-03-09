import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();
    MyFrame(){
        this.setResizable(false);
        this.setSize(500,75);
        this.setTitle("Are you a robot ?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkBox.setText("I am not a robot.");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,15));
        checkBox.setForeground(Color.green);
        checkBox.setBackground(Color.black);
        checkBox.setHorizontalAlignment(JCheckBox.CENTER);

        button.setText("Submit");
        button.setBounds(5,5,5,5);
        button.setFocusable(false);
        button.addActionListener(this);

        this.setVisible(true);
        this.add(checkBox);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
