import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSystem implements ActionListener {
    JLabel label = new JLabel();
    JLabel userLabel = new JLabel("Username :");
    JLabel passLabel = new JLabel("Password :");
    JFrame frame = new JFrame();
    JTextField userField = new JTextField();
    JTextField passField = new JTextField();
    JButton enterButton = new JButton("Enter");
    JButton exitButton = new JButton("Exit");

    LoginSystem(){
        frame.setTitle("Login System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setLayout(null);

        userLabel.setBounds(60,60,120,20);
        userField.setBounds(150,60,120,20);
        passLabel.setBounds(60,100,120,20);
        passField.setBounds(150,100,120,20);
        enterButton.setFocusable(false);
        enterButton.setBackground(Color.lightGray);
        enterButton.addActionListener(this);
        enterButton.setBounds(100,150,70,70);
        exitButton.setFocusable(false);
        exitButton.setBackground(Color.lightGray);
        exitButton.addActionListener(this);
        exitButton.setBounds(180,150,70,70);
        label.setBounds(100,100,300,300);
        label.setLocation(80,80);
        label.setBackground(Color.lightGray);
        label.setOpaque(true);
        label.add(userLabel);
        label.add(userField);
        label.add(passLabel);
        label.add(passField);
        label.add(enterButton);
        label.add(exitButton);

        label.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==enterButton && !(userField.getText().isBlank()) && !(passField.getText().isBlank())){
        JOptionPane optionPane = new JOptionPane();
        optionPane.showMessageDialog(null,"WELCOME TO SYSTEM");
    }
    if(e.getSource()==exitButton){
        System.exit(0);
    }
    }
}