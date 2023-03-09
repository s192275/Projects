import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtons extends JFrame implements ActionListener{
    JButton button;
    public MyButtons(){
        ImageIcon icon =new ImageIcon("C:/Users/s7522/Desktop/musa ilhan.jpeg");
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton();
        button.setVerticalAlignment(JButton.CENTER);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setText("I am a button please click me!");
        button.setSize(50,50);
        button.addActionListener( this);
        button.setIcon(icon);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Musa!");
        }
    }
}