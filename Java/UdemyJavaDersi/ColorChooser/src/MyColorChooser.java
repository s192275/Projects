import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorChooser extends JFrame implements ActionListener {
    JButton button = new JButton("Pick a color");
    JLabel label = new JLabel("This is some text :)");
    MyColorChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setTitle("COLOR CHOOSER");
        this.setLayout(new FlowLayout());
        this.setSize(750,500);
        button.addActionListener(this);
        this.setVisible(true);
        this.add(label);
        this.add(button);
        label.setFont(new Font("MV Boli",Font.BOLD,25));
        label.setOpaque(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"Please pick a color.",Color.black);
            label.setForeground(color);
        }
    }
}
