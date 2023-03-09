import java.util.Scanner;

public class Main{
    static Scanner scan=new Scanner(System.in);
    static int kalanHak=3;
    public static void main(String [] args){
    Kullanici login=new Kullanici("Abuzer","Kömürcü","AbuzerK1234554321.");
    System.out.println("Lütfen şifrenizi giriniz");
    String sifre= scan.nextLine();
     sorgu(sifre,login);

    }

    public static void sorgu(String sifre, Kullanici login) {
        if(!sifre.equals(login.getSifre())) {
            kalanHak-=1;
            while (kalanHak > 0) {
                System.out.println("Girilen şifre yanlıştır.Lütfen bir daha deneyiniz...");
                sifre = scan.nextLine();
                if(sifre!= login.getSifre()) {
                    kalanHak -= 1;
                }
                if(sifre.equals(login.getSifre())){
                    menu(login);
                }
            }
        }
        if(sifre.equals(login.getSifre())){
            menu(login);
        }
    }

    public static void menu(Kullanici login) {
        System.out.println("Bankamıza hoşgeldiniz Sn. "+login.getAd()+" "+login.getSoyad()+ " ...Lütfen yapmak istediğiniz işlemi seçiniz...");
        System.out.println("1.Para çekme:");
        System.out.println("2.Para yatırma:");
        System.out.println("3.Bakiye sorgulama:");
        System.out.println("4.Şifre değiştirme:");
        System.out.println("5.Çıkış:");
        int secim= scan.nextInt();
        switch (secim){
            case 1:
                System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
                int tutar=scan.nextInt();
                if(tutar> login.getBakiye()){
                    System.out.println("Çekilen tutar bakiyeden büyük olamaz... Lütfen tekrar deneyiniz...");
                    secim= scan.nextInt();
                    if(secim< login.getBakiye()){
                        System.out.println("İşlem gerçekleştirildi...");
                    }
                }
                else{
                    login.setBakiye(login.getBakiye()-tutar);
                    System.out.println("İşlem gerçekleştirildi...");
                }
                break;
            case 2:
                System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz:");
                tutar= scan.nextInt();
                while(tutar<0){
                    System.out.println("Tutar 0 dan küçük olamaz.Lütfen tekrar deneyiniz...");
                    tutar= scan.nextInt();
                }
                if(tutar>0){
                    login.setBakiye(login.getBakiye()+tutar);
                }
                break;
            case 3:
                System.out.println("Bakiye sorgulanıyor.Lütfen bekleyiniz...");
                System.out.println("Bakiye: "+login.getBakiye());
                break;
            case 4:
                System.out.println("Lütfen eski şifrenizi giriniz:");
                String sifre=scan.next();
                while(!sifre.equals(login.getSifre())){
                    System.out.println("Lütfen şifrenizi doğru giriniz:");
                    sifre= scan.next();
                }
                if(sifre.equals(login.getSifre())){
                    System.out.println("Lütfen değiştirmek istediğiniz yeni şifreyi giriniz:");
                    sifre= scan.next();
                    login.setSifre(sifre);
                    System.out.println("İşlem tamamlandı...");
                }
                break;
            case 5:
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Lütfen işlem dahilinde bir sayı giriniz:");
                int sayi=scan.nextInt();
                while (sayi>5 || sayi<1){
                    System.out.println("Lütfen işlem dahilinde bir sayi giriniz:");
                    sayi=scan.nextInt();
                }
                if(sayi==1 || sayi==2 || sayi==3 ||sayi==4 || sayi==5){
                    menu(login);
                }
        }
    }
}
class Kullanici{
    private String ad,soyad;
    private String sifre;
    Kullanici(String ad,String soyad,String sifre){
        this.ad=ad;
        this.soyad=soyad;
        this.sifre=sifre;
    }
    private int bakiye=100000;
    public void setAd(String ad){
        this.ad=ad;
    }
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public String getSifre(){
        return sifre;
    }
    public int getBakiye(){
        return bakiye;
    }
    public void setSifre(String sifre){
        this.sifre=sifre;
    }
    public void setBakiye(int bakiye) {
        this.bakiye=bakiye;
    }
}