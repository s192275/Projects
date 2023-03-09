import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
     Panel(){
         this.setPreferredSize(new Dimension(750,750));
     }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.MAGENTA);
        g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,750,750);
        //g2D.drawRect(0,0,100,200);
        //g2D.fill3DRect(100,100,100,200,true);
        g2D.setPaint(Color.red);
        g2D.drawArc(100,100,20,40,0,180);
        g2D.fillArc(100,100,20,40,0,180);
        g2D.setPaint(Color.white);
        g2D.drawArc(100,100,20,40,180,0);
        g2D.fillArc(100,100,20,40,180,0);
        int[] xPoints={150,250,350};
        int [] yPoints={300,150,300};
        g2D.setPaint(Color.MAGENTA);
        g2D.drawPolygon(xPoints,yPoints,3);
     }
}
