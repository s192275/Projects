import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH=1000;
    final int PANEL_HEIGHT=1000;
    Timer timer;
    Image lilMusa;
    Image backGround;
    int xVelocity = 50;
    int yVelocity = 50;
    int x = 0;
    int y = 0;
    MyPanel(){
       this.setPreferredSize(new Dimension(PANEL_HEIGHT,PANEL_WIDTH));
       this.setBackground(Color.BLACK);
       lilMusa = new ImageIcon("C:/Users/s7522/Desktop/musa ilhan.jpeg").getImage();
       timer = new Timer(1000,this);
       timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(lilMusa,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(x>PANEL_WIDTH-lilMusa.getWidth(null) || x<0){
         xVelocity = xVelocity * -1;
     }
     x = x+xVelocity;
        if(y>=PANEL_HEIGHT-lilMusa.getHeight(null) || x<=0){
            yVelocity = yVelocity * -1;
        }
     y = y+yVelocity;
        repaint();
    }
}
