import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        int sayi,toplam=0;
        System.out.println("Lütfen bir sayı giriniz:");
        Scanner number= new Scanner(System.in);
        sayi=number.nextInt();
        while(sayi>0){
            System.out.println("Lütfen bir sayı daha giriniz:");
            Scanner number2= new Scanner(System.in);
            sayi=number2.nextInt();
            toplam=toplam+sayi;
        }
        if(sayi<0){
            System.out.println("İşlem sonlandırıldı.");
        }
        System.out.println("Toplam: "+toplam);
    }
}