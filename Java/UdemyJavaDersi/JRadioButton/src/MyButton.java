import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JFrame implements ActionListener {
    JRadioButton pizzaButton = new JRadioButton("Pizza");
    JRadioButton hamburgerButton = new JRadioButton("Hamburger");
    JRadioButton hotDogButton = new JRadioButton("Hot Dog");

    ImageIcon image1= new ImageIcon("C:/Users/s7522/Downloads/pizza.jpg");
    ImageIcon image2= new ImageIcon("C:/Users/s7522/Downloads/hamburger.png");
    ImageIcon image3= new ImageIcon("C:/Users/s7522/Downloads/hotdog.jpg");

    MyButton () {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Please make your choice !");
        this.setSize(750,500);
        this.setResizable(false);

        pizzaButton.setHorizontalAlignment(JRadioButton.CENTER);
        pizzaButton.setVerticalAlignment(JRadioButton.CENTER);
        hamburgerButton.setHorizontalAlignment(JRadioButton.CENTER);
        hamburgerButton.setVerticalAlignment(JRadioButton.CENTER);
        hotDogButton.setHorizontalAlignment(JRadioButton.CENTER);
        hotDogButton.setVerticalAlignment(JRadioButton.CENTER);

        pizzaButton.setIcon(image1);
        hamburgerButton.setIcon(image2);
        hotDogButton.setIcon(image3);
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        this.setVisible(true);
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == hamburgerButton){
         JOptionPane.showMessageDialog(null,"You just ordered a hamburger !","Hamburger",JOptionPane.INFORMATION_MESSAGE);
     }
     else if (e.getSource() == pizzaButton){
         JOptionPane.showMessageDialog(null,"You just ordered a pizza !","Pizza",JOptionPane.INFORMATION_MESSAGE);
     }
     else if (e.getSource() == hotDogButton){
         JOptionPane.showMessageDialog(null,"You just ordered a hotdog !","Hotdog",JOptionPane.INFORMATION_MESSAGE);
     }
    }
}
