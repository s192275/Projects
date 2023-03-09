import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz:");
        String ad=scan.next();
        System.out.println("Lütfen soyadınızı giriniz:");
        String soyad=scan.next();
        char[] adDizi=ad.toCharArray();
        char[] soyadDizi=soyad.toCharArray();
        for(int i=0;i<adDizi.length;i++) {
            if(i==adDizi.length-3 || i==adDizi.length-2 || i==adDizi.length-1){
                adDizi[i]='*';
            }
            System.out.print(adDizi[i]);
        }
        System.out.print(" ");
        for(int i=0;i<soyadDizi.length;i++) {
            if(i==soyadDizi.length-3 || i==soyadDizi.length-2 || i==soyadDizi.length-1){
                soyadDizi[i]='*';
            }
            System.out.print(soyadDizi[i]);
        }
    }
}