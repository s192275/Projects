import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBox extends JFrame implements ActionListener {

    String [] animals= {"bird","fish","dog","cheetah","monkey","zebra","lion","owl"};
    JComboBox comboBox = new JComboBox(animals);

    MyComboBox(){
       this.setLayout(new FlowLayout());
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setTitle("Please choose your animal");
       this.setSize(400,400);
       this.setResizable(false);
       comboBox.addActionListener(this);
       this.setVisible(true);
       this.add(comboBox);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            JOptionPane.showMessageDialog(null,"You have chosen : "+comboBox.getSelectedItem(),"ANIMAL",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
