import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListener extends JFrame implements KeyListener {
    JLabel label = new JLabel();
    ImageIcon icon;
    MyListener(){
        this.setSize(750,750);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        icon =new ImageIcon("C:/Users/s7522/Downloads/rocket.jpg");
        label.setIcon(icon);
        label.setBounds(0,0,100,100);

        label.setOpaque(true);
        this.addKeyListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped ->Uses KeyChar char output
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10,label.getY());
            break;
            case 'd': label.setLocation(label.getX()+10,label.getY());
            break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
            break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 38: label.setLocation(label.getX()+10,label.getY());
                break;
            case 39: label.setLocation(label.getX(),label.getY()+10);
                break;
            case 40: label.setLocation(label.getX(),label.getY()-10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You relased key char : "+e.getKeyChar());
        System.out.println("You relased key code : "+e.getKeyCode());
    }
}
