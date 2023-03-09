import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****MATRİS TRANSPOZ ÇEVİRİCİ*****");
        int satir,sutun,a;
        System.out.println("Lütfen matrisin satır sayısını giriniz: ");
        satir = scan.nextInt();
        System.out.println("Lütfen matrisin sutun sayısını giriniz: ");
        sutun = scan.nextInt();
        int [][] kullanici_matris = new int[satir][sutun];
        for(int i = 0; i<satir ; i++){
            for(int j = 0 ; j<sutun ; j++){
                System.out.println("Lütfen matrisin "+(i+1)+". satır "+(j+1)+". sutununu giriniz");
                a= scan.nextInt();
                kullanici_matris[i][j] = a;
            }
        }
        System.out.println("Girdiğiniz sayılardan oluşan kullanıcı matrisi :");
        for(int i = 0; i<satir ; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(kullanici_matris[i][j]);
            }
            System.out.println();
        }

        System.out.println("Bilgisayarın oluşturduğu transpoz matris : ");
        int bilgisayar_matris[][] = new int[sutun][satir];
        for(int i = 0; i<satir ; i++){
            for(int j = 0 ; j<sutun ; j++){
                bilgisayar_matris[i][j] = kullanici_matris[j][i];
                System.out.print(bilgisayar_matris[i][j]);
            }
            System.out.println();
        }



    }
}
