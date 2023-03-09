import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("EBOB EKOK bakımından hesaplanacak 1.sayıyı giriniz:");
    int sayi1= scan.nextInt();
    System.out.println("EBOB EKOK bakımından hesaplanacak 2.sayıyı giriniz:");
    int sayi2=scan.nextInt();
    System.out.println("Girilen sayıların EBOB'u: "+ebobAl(sayi1,sayi2));
    System.out.println("Girilen sayıların EKOK'u: "+ekokAl(sayi1,sayi2));

    }

    public static int ebobAl(int sayi1,int sayi2) {
        int kontrol=2,ebob=1;
        while(kontrol<=sayi1 && kontrol<=sayi1){
            if(sayi1%kontrol==0 && sayi2%kontrol==0){
                ebob=kontrol;
                break;
            }
            kontrol++;
        }
        return ebob;
    }

    public static int ekokAl(int sayi1,int sayi2) {
    int ekok=0;
        int buyuk=Math.max(sayi1,sayi2);
    for(int i=buyuk;i<=(sayi1*sayi2);i++){
        if(i%sayi1==0 && i%sayi2==0){
            ekok=i;
            break;
        }
    }
    return ekok;
    }
}