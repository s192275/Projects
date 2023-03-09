import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {
    JFrame frame; //Arayüz için gerekli
    JTextField textField = new JTextField(); //İşlemler burada yapılacak
    JButton[] numberButtons = new JButton[10]; //Buton dizisi sadece sayılar
    JButton[] functionButtons = new JButton[9]; //Buton dizisi sadece işlemler
    JButton addButton, subButton, mulButton, divButton; //Toplama çarpma bölme çıkarma tuşları
    JButton decButton, equButton, delButton, clrButton, negButton; //Silme eşittir temizleme negatif alma tuşları
    JPanel panel; //Butonları panel içine ekleyeceğimiz için oluşturuldu.
    ImageIcon icon = new ImageIcon("C:/Users/s7522/Downloads/c.jpeg");
    JFrame frame2;
    Font myFont = new Font("Ink Free", Font.BOLD, 30); //Yazı tipi için oluşturuldu.

    double num1 = 0, num2 = 0, result = 0; //Sayı1 sayı2 ve sonuç
    char operator; //İşlemler için

    Calc() {
        frame = new JFrame("Calculator"); //Başlığı ayarladık
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Kapatınca programdan çıkar
        frame.setSize(420, 550); //Boyutları ayarladık
        frame.setLayout(null); //Layout kullanmadım boyutu otomatik ayarlamadım manuel ayarladım

        textField.setFont(myFont);
        textField.setBounds(50,25,300,50);// textfield konumu ve boyutları
        textField.setEditable(false);// üzerine yazı yazılamaz istediğimiz de bu butonlara bastıkça sayılar gözükecek

        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setBounds(50,100,300,300); //panel ayarları
        panel.setLayout(new GridLayout(4,4,10,10)); //panele layout koyduk ki tuşları panele attığımız için paneldeki layouta göre otomatik dizilir

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("DEL");
        clrButton = new JButton("CLR");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;


        for(int i = 0 ;i< 8; i++){
         functionButtons[i].setFocusable(false);
         functionButtons[i].setFont(myFont);
         functionButtons[i].addActionListener(this);
        }
        for(int i = 0; i<10; i++){
            numberButtons[i]= new JButton((String.valueOf(i)));
            numberButtons[i].setFocusable(false);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
        }

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);

        frame.add(textField);
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++) { //Basılan butonlar sayıya eşit olunca birleştirme işlemi yap
            if(e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==decButton) { //Basılan buton decButton sa . koy
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource()==addButton) { //Basılan buton addButtonsa num1 i textField teki String i double yap operator ü de + yap
            num1 = Double.parseDouble(textField.getText());
            operator ='+';
            textField.setText(""); //Sonra da texti boş yap
        }
        if(e.getSource()==subButton) {
            num1 = Double.parseDouble(textField.getText());//Basılan buton subButtonsa num1 i textField teki String i double yap operator ü de - yap
            operator ='-';
            textField.setText("");//Sonra da texti boş yap
        }
        if(e.getSource()==mulButton) {
            num1 = Double.parseDouble(textField.getText());//Basılan buton mulButtonsa num1 i textField teki String i double yap operator ü de * yap
            operator ='*';
            textField.setText("");// Sonra da texti boş yap
        }
        if(e.getSource()==divButton) {
            num1 = Double.parseDouble(textField.getText()); //Basılan buton divButtonsa num1 i textField teki String i double yap operator ü de / yap
            operator ='/';
            textField.setText("");//Sonra da texti boş yap
        }
        if(e.getSource()==equButton) { //Basılan buton equButtonsa num2 yi double a çevir
            num2=Double.parseDouble(textField.getText());

            switch(operator) {
                case'+':
                    result=num1+num2;
                    if(result == 31 ){
                        frame2 = new JFrame();
                        frame2.setSize(1000,1000);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JLabel label = new JLabel(icon);
                        frame2.add(label);
                        frame2.setVisible(true);
                    }
                    break;
                case'-':
                    result=num1-num2;
                    if(result == 31 ){
                        frame2 = new JFrame();
                        frame2.setSize(1000,1000);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JLabel label = new JLabel(icon);
                        frame2.add(label);
                        frame2.setVisible(true);
                    }
                    break;
                case'*':
                    result=num1*num2;
                    if(result == 31 ){
                        frame2 = new JFrame();
                        frame2.setSize(1000,1000);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JLabel label = new JLabel(icon);
                        frame2.add(label);
                        frame2.setVisible(true);
                    }
                    break;
                case'/':
                    result=num1/num2;
                    if(result == 31 ){
                        frame2 = new JFrame();
                        frame2.setSize(1000,1000);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JLabel label = new JLabel(icon);
                        frame2.add(label);
                        frame2.setVisible(true);
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrButton) { //clrButtona basınca textFieldi temizle
            textField.setText("");
        }
        if(e.getSource()==delButton) { //delButtona basınca textField taki metni String e atayıp setText le metni boş bırakıp for döngüsü ile boş bırakılan metne asıl metnin 1 eksiğine kadar içerik atar.
            String string = textField.getText();
            textField.setText("");
            for(int i=0;i<string.length()-1;i++) {
                textField.setText(textField.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==negButton) { //negButtona basınca sayının negatifini al
            double temp = Double.parseDouble(textField.getText());
            temp*=-1;
            textField.setText(String.valueOf(temp));
        }
    }
}
