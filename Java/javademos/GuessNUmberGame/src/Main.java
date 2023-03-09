import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int can=4;
    int tahmin;
    Random rand=new Random();
    int sayi=rand.nextInt(100);
    System.out.println("Lütfen sistem tarafından tutulan sayıyı tahmin etmek için sayı girişi yapınız:");
    Scanner input=new Scanner(System.in);
    tahmin=input.nextInt();

    if(tahmin==sayi){
        System.out.println("Tebrikler doğru bildiniz:");
    }
    while(sayi!=tahmin){
        System.out.println("Bilemediniz.Lütfen tekrar deneyiniz:Kalan can: "+can);
        tahmin=input.nextInt();
        can--;
        if(can==0){
            System.out.println("Hiçbir hakkınızda bilemediniz.Canınız bitti.Oyun bitti.");

           break;
        }
    }
    }
}
