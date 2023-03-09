import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener extends JFrame implements MouseListener {
    JPanel panel = new JPanel();
    MyMouseListener(){
        this.setSize(700,700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        panel.setBackground(Color.red);
        panel.setBounds(200,400,75,75);
        panel.addMouseListener(this);
        this.setVisible(true);
        this.add(panel);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse");
        panel.setBackground(Color.BLACK);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       System.out.println("You pressed the mouse");
       panel.setBackground(Color.blue);
       panel.setBounds(75,75,75,75);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      System.out.println("You released the mouse");
      panel.setBackground(Color.green);
      panel.setBounds(100,100,100,100);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      System.out.println("You entered the mouse");
      panel.setBackground(Color.magenta);
      panel.setBounds(50,50,50,50);
    }

    @Override
    public void mouseExited(MouseEvent e) {
     System.out.println("You exited the mouse");
     panel.setBackground(Color.DARK_GRAY);
     panel.setBounds(25,25,25,25);
    }
}
