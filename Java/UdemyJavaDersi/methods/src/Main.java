import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice,number1,number2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen seçiminizi yapınız:");
	    choice= scan.nextInt();
        if(choice==0){
            System.out.println("Sistemden çıkış yapılıyor...");
        }
        while(choice!=0){
            showMenu();
            choice= scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Lütfen birinci sayıyı giriniz:");
                    number1= scan.nextInt();
                    System.out.println("Lütfen ikinci sayıyı giriniz:");
                    number2= scan.nextInt();
                    System.out.println("Cevap: "+addNumbers(number1,number2));
                    break;
                case 2:
                    System.out.println("Lütfen birinci sayıyı giriniz:");
                    number1= scan.nextInt();
                    System.out.println("Lütfen ikinci sayıyı giriniz:");
                    number2= scan.nextInt();
                    System.out.println("Cevap: "+farkNumbers(number1,number2));
                    break;
                case 3:
                    System.out.println("Lütfen birinci sayıyı giriniz:");
                    number1= scan.nextInt();
                    System.out.println("Lütfen ikinci sayıyı giriniz:");
                    number2= scan.nextInt();
                    System.out.println("Cevap: "+multipleNumbers(number1,number2));
                    break;
                case 4:
                    System.out.println("Lütfen birinci sayıyı giriniz:");
                    number1= scan.nextInt();
                    System.out.println("Lütfen ikinci sayıyı giriniz:");
                    number2= scan.nextInt();
                    System.out.println("Cevap: "+divNumbers(number1,number2));
                    break;
                default:
                    System.out.println("Geçersiz işlem");
                    break;
            }
        }
    }
    static int addNumbers(int a,int b){
        return a+b;
    }
    static int multipleNumbers(int a,int b){
        return a*b;
    }
    static double divNumbers(int a,int b){
        return (a/b);
        }
    static int farkNumbers(int a,int b){
        return a-b;
    }
    public static void showMenu(){
        System.out.println("****MENU****");
        System.out.println("1-İki sayı girin ve toplamı bulunsun.");
        System.out.println("2-İki sayı girin ve farkı bulunsun.");
        System.out.println("3-İki sayı girin ve çarpımı bulunsun.");
        System.out.println("4-İki sayı girin ve bölümü bulunsun.");
    }
}
