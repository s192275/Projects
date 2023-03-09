import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1,sayi2;
        char islem;
        float sonuc;
	System.out.println("Lütfen birinci sayıyı giriniz:");
        Scanner input= new Scanner(System.in);
        sayi1= input.nextInt();
        System.out.println(sayi1);
    System.out.println("Lütfen yapacağınız işlemi seçiniz:");
        Scanner calculate= new Scanner(System.in);
        islem=calculate.next().charAt(0);
        System.out.println(islem);
    System.out.println("Lütfen ikinci sayıyı giriniz:");
        Scanner input2 = new Scanner(System.in);
        sayi2=input.nextInt();
        System.out.println(sayi2);
        switch (islem){
            case '+':
                sonuc=sayi1+sayi2;
                System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case '-':
                sonuc=sayi1-sayi2;
                System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case '*':
                sonuc=sayi1*sayi2;
                System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case '/':
                sonuc=sayi1/sayi2;
                System.out.println("İşlemin sonucu: "+sonuc);
                break;
            default:
                System.out.println("Geçersiz işlem ya da komutlar kümesi...");
        }
    }
}
