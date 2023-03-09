import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField extends JFrame implements ActionListener {
    JTextField textField = new JTextField();
    JButton button;
    MyTextField (){
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,100);

        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        textField.setPreferredSize(new Dimension(200,40));
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.GREEN);
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setCaretColor(Color.white);
        textField.setText("username");
        //textField.setEditable(false);

        this.add(button);
        this.add(textField);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == button){
         JOptionPane.showMessageDialog(null,"Hello "+textField.getText() ,"WELCOME !",JOptionPane.INFORMATION_MESSAGE);
         button.setEnabled(true);
     }
    }
}
