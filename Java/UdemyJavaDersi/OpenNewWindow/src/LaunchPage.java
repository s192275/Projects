import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();

    LaunchPage(){
        frame.setResizable(true);
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        button.setText("Click me!");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBounds(150,150,100,50);

        frame.setVisible(true);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose(); //butona tıklanıldığı zaman ilk sayfa silinir !
            NewWindow window = new NewWindow();
        }
    }
}
