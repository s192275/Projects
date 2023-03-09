import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyMenuBar extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenuItem loadMenuItem = new JMenuItem("Load");
    JMenuItem saveMenuItem = new JMenuItem("Save");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    MyMenuBar(){
        this.setSize(700,700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MENUBAR");
        this.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");


        fileMenu.setBounds(0,0,30,30);
        exitMenuItem.setBounds(0,30,30,30);
        editMenu.setBounds(30,0,30,30);
        saveMenuItem.setBounds(0,60,30,30);
        loadMenuItem.setBounds(0,90,30,30);
        helpMenu.setBounds(60,0,30,30);

        fileMenu.setMnemonic(KeyEvent.VK_F); //Alt+F
        editMenu.setMnemonic(KeyEvent.VK_D); //Alt+D
        helpMenu.setMnemonic(KeyEvent.VK_H); //Alt+H
        loadMenuItem.setMnemonic(KeyEvent.VK_L); //L
        saveMenuItem.setMnemonic(KeyEvent.VK_S); //S
        exitMenuItem.setMnemonic(KeyEvent.VK_E); //E

        saveMenuItem.addActionListener(this);
        loadMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

        menuBar.add(fileMenu);
        fileMenu.add(loadMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setVisible(true);
        this.add(menuBar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadMenuItem){
                System.out.println("Your file is loading...");
        }
        if (e.getSource()==saveMenuItem){
            System.out.println("Your file is saved...");
        }
        if(e.getSource()==exitMenuItem){
            System.exit(0);
        }

    }
}
