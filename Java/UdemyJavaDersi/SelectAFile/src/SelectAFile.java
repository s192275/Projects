import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SelectAFile extends JFrame implements ActionListener {
    JButton button = new JButton("Click");
    SelectAFile(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        button.setPreferredSize(new Dimension(100,50));
        button.setBounds(150,200,100,50);
        button.setFocusable(false);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            int response =fileChooser.showOpenDialog(null); //select file to open.It returns integer value to response 0->open 1->close or cancel
            if (response ==JFileChooser.APPROVE_OPTION){
                File file =new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
