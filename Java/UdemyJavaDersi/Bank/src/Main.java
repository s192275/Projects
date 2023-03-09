import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int amountOfMoney=0,cekilecek=0;
        Scanner scan=new Scanner(System.in);
	System.out.println("Bank'a Hoşgeldiniz.Lütfen kullanıcı adınızı giriniz...");
    String userName= scan.nextLine();
    System.out.println("Hoşgeldiniz "+userName+" !");
    Bank b1=new Bank(userName,amountOfMoney,cekilecek);
    System.out.println("Para yatırmak için 1'e para çekmek için 2'ye basınız:");
    int choice= scan.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Lütfen yatırmak istediğiniz tutar girişini giriniz:");
            int money = scan.nextInt();
            System.out.println("Hesabınızdaki güncel para: " + (b1.getAmountOfMoney() + money));
            break;
        case 2:
            System.out.println("Lütfen çekmek istediğiniz tutar girişini giriniz:");
            cekilecek = scan.nextInt();
            if(cekilecek> b1.getAmountOfMoney()){
                System.out.println("Çekeceğiniz para hesabınızdaki paradan büyük olduğu için işlem gerçekleştirilemiyor:");
            }
            else{
                System.out.println("Hesabınızda kalan güncel para: "+(b1.getAmountOfMoney()-cekilecek));
            }
            break;
        default:
            System.out.println("Geçersiz işlem.Sistemden çıkış yapılıyor...");
    }
    }
}
class Bank{
    private String userName;
    private int amountOfMoney=12000;
    int cekilecek;
    Bank(String userName,int amountOfMoney,int cekilecek){
        amountOfMoney=12000;
        this.amountOfMoney=amountOfMoney;
        this.userName=userName;
        this.cekilecek=cekilecek;
    }

    public int getCekilecek() {
        return cekilecek;
    }

    public void setCekilecek(int cekilecek) {
        this.cekilecek = cekilecek;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

}