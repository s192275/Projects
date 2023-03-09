import javax.swing.*;

public class TwoD extends JFrame {
    TwoD() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        this.setLocationRelativeTo(null);
        this.setSize(750,750);
        this.add(panel);
        this.setVisible(true);
    }


}
