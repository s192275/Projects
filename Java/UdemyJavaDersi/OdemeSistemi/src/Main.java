import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame("MASA DÜZENİ");
    JLabel label = new JLabel();
    label.setSize(1500,950);
    JButton [] button = new JButton[31];
    frame.setVisible(true);
    frame.setSize(1540,1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    for(int i = 0 ; i < 31; i++){
        button[i] = new JButton();
        button[i].setText(String.valueOf(i));
        button[i].setFocusable(false);
        button[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("MENU");
                frame2.setSize(1000,1000);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setVisible(true);
                JLabel label2 = new JLabel();
                label2.setSize(1500,1000);

                JLabel label3 = new JLabel("Patso");
                label3.setBounds(50,50,50,50);
                String [] patso = {"Hiçbiri","Kaşarlı Patso.....25 TL ", "Karışık Patso.....30 TL", "Dönerli Patso.....27 TL", "Sosisli Patso.....28 TL","Schnitzelli Patso.....28 TL"};
                JComboBox comboBox = new JComboBox(patso);
                comboBox.setBounds(150,50,150,70);

                JLabel label4 = new JLabel("Pide");
                label4.setBounds(50,150,50,50);
                String [] pide = {"Hiçbiri","Kaşarlı Pide.....30 TL ", "Karışık Pide.....50 TL", "Kıymalı Pide.....35 TL", "Kıymalı-Kaşarlı Pide.....38 TL","Kuşbaşılı Pide......42 TL","Kuşbaşılı-Kaşarlı Pide.....45 TL"};
                JComboBox comboBox2 = new JComboBox(pide);
                comboBox2.setBounds(150,150,200,70);

                JLabel label5 = new JLabel("Tost");
                label5.setBounds(50,250, 50,50);
                String [] tost = {"Hiçbiri","Kaşarlı.....20 TL","Çift Kaşarlı.....23 TL","Karışık.....26 TL"};
                JComboBox comboBox3 = new JComboBox(tost);
                comboBox3.setBounds(150,250,200,70);

                JLabel label6 = new JLabel("Menemen");
                label6.setBounds(50,350,70,70);
                String [] menemen = {"Hiçbiri","Sade.....25 TL","Kaşarlı.....32 TL","Sucuklu.....35 TL","Kavurmalı.....40 TL","Karışık.....45 TL"};
                JComboBox comboBox4 = new JComboBox(menemen);
                comboBox4.setBounds(150,350,100,70);

                JLabel label7 = new JLabel("Omlet");
                label7.setBounds(50,450,70,70);
                String [] omlet = {"Sade.....20 TL","Kavurmalı.....30 TL","Sucuklu.....30 TL","Kaşarlı......25 TL","Beyaz Peynirli......25 TL"};
                JComboBox comboBox5 = new JComboBox(omlet);
                comboBox5.setBounds(150,450,200,70);

                JLabel label8 = new JLabel("Sıcak Sandviç");
                label8.setBounds(50,550,70,70);
                String [] sicakSandvic = {"Hamburger......30 TL","Çizburger.....35 TL","Sosisli.....20 TL"};
                JComboBox comboBox6 = new JComboBox(sicakSandvic);
                comboBox6.setBounds(150,550,150,70);

                JLabel label9 = new JLabel("Soğuk Sandviç");
                label9.setBounds(50,650,100,70);
                String [] sogukSandvic = {"Hiçbiri","Büyük Sandviç(Beyaz peynir/Salam,salatalık,domates,salam,biber).....25 TL"};
                JComboBox comboBox7 = new JComboBox(sogukSandvic);
                comboBox7.setBounds(160,650,300,70);

                JLabel label10 = new JLabel("Çorba");
                label10.setBounds(50,750,50,70);
                String [] corba = {"Hiçbiri","Mercimek.....20 TL","Tarhana.....30 TL","Yayla.....20 TL","İşkembe......35 TL","Tuzlama.....35 TL","Kelle-Paça.....35 TL"};
                JComboBox comboBox8 = new JComboBox(corba);
                comboBox8.setBounds(150,750,150,70);

                JLabel label11 = new JLabel("İçecek");
                label11.setBounds(450,50,70,70);
                String [] icecek = {"Cola Çeşitleri.....9 TL", "Ayran.....7 TL", "Su.....3 TL", "Çay.....5 TL", "Kahve.....10 TL"};
                JComboBox comboBox9 = new JComboBox(icecek);
                comboBox9.setBounds(550,50,150,70);

                JButton button11 = new JButton("İptal et");
                button11.setBounds(700,700,100,70);
                button11.setFocusable(false);
                button11.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                JButton button12 = new JButton("Sipariş Ver");
                button12.setBounds(810,700,100,70);
                button12.setFocusable(false);
                button12.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame f = new JFrame();
                        JOptionPane.showMessageDialog(f,"Siparişiniz alındı...");
                    }
                });

                frame2.add(label2);
                label2.add(label3);
                label2.add(comboBox);
                label2.add(label4);
                label2.add(comboBox2);
                label2.add(label5);
                label2.add(comboBox3);
                label2.add(label6);
                label2.add(comboBox4);
                label2.add(label7);
                label2.add(comboBox5);
                label2.add(label8);
                label2.add(comboBox6);
                label2.add(label9);
                label2.add(comboBox7);
                label2.add(label10);
                label2.add(comboBox8);
                label2.add(label11);
                label2.add(comboBox9);
                label2.add(button11);
                label2.add(button12);
            }
        });
    }
    button[0].setBounds(100,100,100,100);
    button[1].setBounds(200,100,100,100);
    button[2].setBounds(400,100,100,100);
    button[3].setBounds(500,100,100,100);
    button[4].setBounds(700,100,100,100);
    button[5].setBounds(800,100,100,100);
    button[6].setBounds(1000,100,100,100);
    button[7].setBounds(1100,100,100,100);
    button[8].setBounds(1300,100,100,100);
    button[9].setBounds(1400,100,100,100);
    button[10].setBounds(100,250,100,100);
    button[11].setBounds(200,250,100,100);
    button[12].setBounds(400,250,100,100);
    button[13].setBounds(500,250,100,100);
    button[14].setBounds(700,250,100,100);
    button[15].setBounds(800,250,100,100);
    button[16].setBounds(1000,250,100,100);
    button[17].setBounds(1100,250,100,100);
    button[18].setBounds(1300,250,100,100);
    button[19].setBounds(1400,250,100,100);
    button[20].setBounds(100,400,100,100);
    button[21].setBounds(200,400,100,100);
    button[22].setBounds(400,400,100,100);
    button[23].setBounds(500,400,100,100);
    button[24].setBounds(700,400,100,100);
    button[25].setBounds(800,400,100,100);
    button[26].setBounds(1000,400,100,100);
    button[27].setBounds(1100,400,100,100);
    button[28].setBounds(1300,400,100,100);
    button[29].setBounds(1400,400,100,100);
    button[30].setBounds(100,550,100,100);

    for(int i = 0 ; i < 31 ; i++){
        frame.add(button[i]);
    }
    frame.add(label);
    }
}
