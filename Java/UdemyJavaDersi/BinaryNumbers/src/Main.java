import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen binary formatına dönüştürülecek sayıyı giriniz:");
        int sayi = scan.nextInt();
        int gecici = sayi;
        if (sayi == 0) {
            System.out.println("0");
        }
        String binary = "";
        while (gecici > 0) {
            int binary1 = gecici % 2;
            binary = binary1 + binary;
            gecici /= 2;
        }
        System.out.println(binary);
    }
}
