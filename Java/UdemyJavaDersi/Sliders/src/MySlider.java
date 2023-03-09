import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MySlider extends JFrame implements ChangeListener {
    JSlider slider = new JSlider(1,0,100,0);
    JLabel label = new JLabel();
    MySlider(){
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        slider.addChangeListener(this);
        slider.setSize(250,40);
        slider.setFocusable(false);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setVisible(true);

        this.setVisible(true);
        this.add(slider);
        this.add(label);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("The tempature is : "+slider.getValue()+" degrees.");
    }
}
