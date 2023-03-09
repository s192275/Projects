import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CV extends JFrame implements ActionListener{
    JOptionPane optionPane = new JOptionPane();
    JLabel label = new JLabel("Ad-Soyad");
    JLabel label2 = new JLabel("Yaş");
    JLabel label3 = new JLabel("Meslek");
    JLabel label4 = new JLabel("Cinsiyet");
    JLabel label5 = new JLabel("Adres");
    JLabel label6 = new JLabel("Telefon");
    JLabel label7 = new JLabel("E-posta");
    JLabel label8 = new JLabel("Mezun Olunan Okul");
    JLabel label9 = new JLabel("Mezuniyet Ortalaması");
    JLabel label10 = new JLabel("İş Tecrübesi");
    JLabel label11 = new JLabel("İş Tecrübeniz Varsa Kaç Yıllık");
    JLabel label12 = new JLabel("Medeni Durum");
    JLabel label13 = new JLabel("Askerlik Durumu");
    JLabel label14 = new JLabel("Yaşanılan İl");
    JLabel label15 = new JLabel("Yaşanılan İlçe");
    JLabel label16 = new JLabel("Bilinen Diller");
    JButton button = new JButton("Onayla");
    JButton button2 = new JButton("İptal");
    JButton button3 = new JButton("Çıkış");
    String [] cinsiyet={"Kadın","Erkek"};
    String [] ort = {"1 altı", "1", "1-1.5 arası","1.5","1.5-2 arası","2","2-2.5 arası", "2.5","2.5-3 arası","3","3-3.5 arası","3.5","3.5-4 arası","4"};
    String [] tecrube = {"Var","Yok"};
    String [] yil = {"1 yıldan az","1 yıl","1-2 yıl arası","2 yıl","2-3 yıl arası","3 yıl","+3 yıl"};
    String [] askerlikDurumu ={"Yapıldı","Yapılmadı"};
    JTextField textField = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JComboBox comboBox4 = new JComboBox(cinsiyet);
    JTextField textField5 = new JTextField();
    JTextField textField6 = new JTextField();
    JTextField textField7 = new JTextField();
    JTextField textField8 = new JTextField();
    JComboBox comboBox9 = new JComboBox(ort);
    JComboBox comboBox10 = new JComboBox(tecrube);
    JComboBox comboBox11 = new JComboBox(yil);
    JRadioButton evli12 = new JRadioButton("Evli",false);
    JRadioButton bekar12 = new JRadioButton("Bekar",false);
    JComboBox comboBox13 = new JComboBox(askerlikDurumu);
    JTextField textField14 = new JTextField();
    JTextField textField15 = new JTextField();
    JRadioButton dil16 = new JRadioButton("İngilizce");
    JRadioButton dil17 = new JRadioButton("Fransızca");
    JRadioButton dil18 = new JRadioButton("Almanca");
    JRadioButton dil19 = new JRadioButton("İspanyolca");
    JRadioButton dil20 = new JRadioButton( "Felemenkçe");
    JRadioButton dil21 = new JRadioButton("Japonca");
    CV(){
        this.setSize(1900,1900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CV OLUŞTUR");
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.lightGray);

        label.setBounds(10,10,250,50);
        textField.setBounds(150,20,150,30);
        textField.setBackground(Color.lightGray);

        label2.setBounds(10,50,250,50);
        textField2.setBounds(150,60,150,30);
        textField2.setBackground(Color.lightGray);

        label3.setBounds(10,90,250,50);
        textField3.setBounds(150,100,150,30);
        textField3.setBackground(Color.lightGray);

        label4.setBounds(10,130,250,50);
        comboBox4.setBounds(150,140,150,30);
        comboBox4.setBackground(Color.lightGray);

        label5.setBounds(10,170,250,50);
        textField5.setBounds(150,180,500,30);
        textField5.setBackground(Color.lightGray);

        label6.setBounds(10,210,250,50);
        textField6.setBounds(150,220,150,30);
        textField6.setBackground(Color.lightGray);

        label7.setBounds(10,250,250,50);
        textField7.setBounds(150,260,150,30);
        textField7.setBackground(Color.lightGray);

        label8.setBounds(10,290,250,50);
        textField8.setBounds(150,300,150,30);
        textField8.setBackground(Color.lightGray);

        label9.setBounds(10,330,250,50);
        comboBox9.setBounds(150,340,150,30);
        comboBox9.setBackground(Color.lightGray);

        label10.setBounds(10,370,250,50);
        comboBox10.setBounds(150,380,150,30);
        comboBox10.setBackground(Color.lightGray);

        label11.setBounds(10,410,250,50);
        comboBox11.setBounds(200,420,150,30);
        comboBox11.setBackground(Color.lightGray);

        label12.setBounds(10,450,250,50);
        evli12.setBounds(150,450,75,75);
        evli12.setBackground(Color.lightGray);
        bekar12.setBounds(225,450,75,75);
        bekar12.setBackground(Color.lightGray);
        evli12.addActionListener( this);
        bekar12.addActionListener(this);

        label13.setBounds(10,525,150,50);
        comboBox13.setBounds(150,525,150,30);
        comboBox13.setBackground(Color.lightGray);

        label14.setBounds(10,565,150,50);
        textField14.setBounds(150,565,150,30);
        textField14.setBackground(Color.lightGray);

        label15.setBounds(10,605,150,50);
        textField15.setBounds(150,605,150,30);
        textField15.setBackground(Color.lightGray);

        label16.setBounds(10,645,150,50);
        dil16.setBounds(150,645,75,75);
        dil16.setBackground(Color.lightGray);
        dil17.setBounds(225,645,100,75);
        dil17.setBackground(Color.lightGray);
        dil18.setBounds(325,645,100,75);
        dil18.setBackground(Color.lightGray);
        dil19.setBounds(425,645,100,75);
        dil19.setBackground(Color.lightGray);
        dil20.setBounds(525,645,100,75);
        dil20.setBackground(Color.lightGray);
        dil21.setBounds(625,645,75,75);
        dil21.setBackground(Color.lightGray);

        button.setBounds(800,700,90,50);
        button.setBackground(Color.lightGray);
        button.setFocusable(false);
        button.addActionListener(this);
        button2.setBounds(900,700,90,50);
        button2.setBackground(Color.lightGray);
        button.setFocusable(false);
        button3.setBounds(1000,700,90,50);
        button3.setBackground(Color.lightGray);
        button3.addActionListener(this);
        button.setFocusable(false);

        this.add(label);
        this.add(textField);
        this.add(label2);
        this.add(textField2);
        this.add(label3);
        this.add(textField3);
        this.add(label4);
        this.add(comboBox4);
        this.add(label5);
        this.add(textField5);
        this.add(label6);
        this.add(textField6);
        this.add(label7);
        this.add(textField7);
        this.add(label8);
        this.add(textField8);
        this.add(label9);
        this.add(comboBox9);
        this.add(label10);
        this.add(comboBox10);
        this.add(label11);
        this.add(comboBox11);
        this.add(label12);
        this.add(evli12);
        this.add(bekar12);
        this.add(label13);
        this.add(comboBox13);
        this.add(label14);
        this.add(textField14);
        this.add(label15);
        this.add(textField15);
        this.add(label16);
        this.add(dil16);
        this.add(dil17);
        this.add(dil18);
        this.add(dil19);
        this.add(dil20);
        this.add(dil21);
        this.add(button);
        this.add(button2);
        this.add(button3);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==evli12){
            bekar12.setEnabled(false);
        }
        if(e.getSource()==bekar12){
            evli12.setEnabled(false);
        }
        if (e.getSource()==button){
            optionPane.showMessageDialog(null,"CV'niz Oluşturuldu.","Tebrikler",JOptionPane.INFORMATION_MESSAGE);
        }
        if (e.getSource()==button3){
            System.exit(0);
        }
    }
}
