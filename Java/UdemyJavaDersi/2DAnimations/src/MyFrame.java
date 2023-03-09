import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel myPanel = new MyPanel();
    MyFrame(){
        this.setTitle("2D MUSA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.add(myPanel);
        this.setVisible(true);
    }
}
