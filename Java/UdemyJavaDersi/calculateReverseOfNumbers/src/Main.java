import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen tersi alınacak sayıyı giriniz:");
    int sayi=scan.nextInt();
    int gecici,tersi=0;
    gecici=sayi;
    while(gecici!=0){
        int basamak=gecici%10;
        tersi=tersi*10+basamak;
        gecici/=10;
    }
    System.out.println("Tersi alınması için girilen "+sayi+" sayısının tersi "+tersi+" sayısıdır.");
    }
}
