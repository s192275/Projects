import javax.swing.*;
import java.awt.*;

public class MyProgressBar extends JFrame {
    JProgressBar progressBar = new JProgressBar();
    MyProgressBar(){
        this.setSize(400,400);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        progressBar.setBounds(0,0,400,100);
        progressBar.setValue(0);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli", Font.BOLD,25));
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.black);
        progressBar.setVisible(true);

        this.add(progressBar);
        this.setVisible(true);
        fill();
    }
    private void fill(){
        int value = 0;
        while (value >= 0){
            progressBar.setValue(value);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            value += 1;
        }
        progressBar.setString("Done! :)");
    }
}
