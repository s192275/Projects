import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame();

    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.red);
    redPanel.setBounds(0 , 0 , 250 , 250);

    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(250,0,250,250);

    JPanel yellowPanel = new JPanel();
    yellowPanel.setBackground(Color.yellow);
    yellowPanel.setBounds(500,0,250,250);

    JPanel pinkPanel = new JPanel();
    pinkPanel.setBackground(Color.pink);
    pinkPanel.setBounds(0,250,250,250);

    JPanel orangePanel = new JPanel();
    orangePanel.setBackground(Color.orange);
    orangePanel.setBounds(250,250,250,250);

    JPanel cyanPanel = new JPanel();
    cyanPanel.setBackground(Color.CYAN);
    cyanPanel.setBounds(500,250,250,250);

    JPanel magentaPanel = new JPanel();
    magentaPanel.setBackground(Color.magenta);
    magentaPanel.setBounds(0,500,250,250);

    JPanel whitePanel = new JPanel();
    whitePanel.setBackground(Color.DARK_GRAY);
    whitePanel.setBounds(250,500,250,250);

    JPanel panel = new JPanel();
    panel.setBackground(Color.getHSBColor(123,50,250));
    panel.setBounds(500,500,250,250);

    frame.setVisible(true);
    frame.setSize(750,750);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(redPanel);
    frame.add(bluePanel);
    frame.add(yellowPanel);
    frame.add(pinkPanel);
    frame.add(orangePanel);
    frame.add(cyanPanel);
    frame.add(whitePanel);
    frame.add(panel);
    }
}
