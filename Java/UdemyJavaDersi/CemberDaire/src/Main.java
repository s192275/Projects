import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen çemberin çevresinin hesaplanabilmesi için yarıçap değeri giriniz:");
        double sayi1=scan.nextDouble();
        System.out.println("Lütfen dairenin alanının hesaplanabilmesi için yarıçap değeri giriniz:");
        double sayi2= scan.nextDouble();
        CemberDaire c1=new CemberDaire(sayi1,sayi2);
    }
}
