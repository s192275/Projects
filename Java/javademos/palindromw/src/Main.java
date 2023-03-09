import java.util.Scanner;

public class Main {

    public static int hesapla(int sayi){
        int gecicii,kalan ,ters=0;
        double basamak=0;
        gecicii=sayi;
        while(gecicii!=0){
            kalan=gecicii%10;
            gecicii=gecicii/10;
            basamak++;
        }
        gecicii=sayi;
        while(basamak>=1){
            kalan=gecicii%10;
            gecicii=gecicii/10;
            ters = (int )(kalan * (Math.pow(10, basamak - 1))) + ters;
            basamak--;
        }
        return ters;
    }
    public static void main(String[] args) {
        int sayi;
        System.out.println("Lütfen palindromluk bakımından hesaplanacak sayıyı giriniz:");
        Scanner number=new Scanner(System.in);
        sayi=number.nextInt();
        System.out.println(hesapla(sayi));
        if(sayi==hesapla(sayi)){
            System.out.println("Girilen sayı bir palindrom sayıdır.");
        }
        else{
            System.out.println("Girilen sayı palindrom bir sayı değildir.");
        }
    }
}
