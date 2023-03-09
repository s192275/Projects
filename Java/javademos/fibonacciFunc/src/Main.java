import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int birincisayi=0,ikincisayi=1;
    int toplam=0,sayi,i;
    System.out.println("Fibonacci dizisinin kaç elemanlı olmasını istiyorsanız giriniz:");
    Scanner eleman=new Scanner(System.in);
    sayi=eleman.nextInt();
    for(i=0;i<sayi;i++){
       toplam=birincisayi+ikincisayi;
       birincisayi=ikincisayi;
       ikincisayi=toplam;
    }
    System.out.println("Dizinin toplami: "+toplam);
    }
}
