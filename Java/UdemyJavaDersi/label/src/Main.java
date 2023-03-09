import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame();
    JLabel label = new JLabel(); //create a label
    ImageIcon image = new ImageIcon("C:/Users/s7522/Downloads/image.png");
    frame.setIconImage(image.getImage());
    Border border = BorderFactory.createLineBorder(Color.GREEN,3); //create a border to cover the app
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER); //set vertical position icon+text within label
    label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position icon+text within label
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER); //set text left,right or center of image icon
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(Color.GREEN);
    label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font color of text
    label.setIconTextGap(20);//set gap of text to image
    label.setBackground(Color.BLACK);
    label.setOpaque(true); //display background color
    //label.setBounds(100,100,250,250); set x,y position within frame as well as dimensions
    label.setText("Bro, do you even code?"); //set text
    frame.setVisible(true);
    //frame.setSize(400,400);
    //frame.setLayout(null);
    frame.setResizable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(label);
    frame.pack();

    }
}
