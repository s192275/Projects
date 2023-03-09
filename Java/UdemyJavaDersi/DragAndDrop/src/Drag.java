import javax.swing.*;

public class Drag extends JFrame {
    DragAndDrop dragAndDrop =new DragAndDrop();
    Drag(){
        this.setSize(750,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(dragAndDrop);
    }
}
