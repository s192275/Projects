import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cm,kilo;
        double sonuc;
        Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen boyunuzu cm cinsinden giriniz:");
    cm=scan.nextInt();
    System.out.println("Lütfen ağırlığınızı kilogram cinsinden giriniz:");
    kilo= scan.nextInt();
    double a=kilo;
    double b= cm /100.0;
    sonuc=a/Math.pow(b,2);
    if(sonuc<15){
        System.out.println("Çok ciddi derecede düşük kilolusunuz");
    }
    if(sonuc>15 && sonuc<16){
        System.out.println("Ciddi derecede düşük kilolusunuz");
    }
    if(sonuc>16 && sonuc<18.5){
        System.out.println("Düşük kilolusunuz");
    }
    if(sonuc>18.5 && sonuc<25){
        System.out.println("Sağlığınız yerinde");
    }
    if(sonuc>25 && sonuc<30){
        System.out.println("Fazla kilolusunuz");
    }
    if(sonuc>30 && sonuc<35){
        System.out.println("1.dereceden obezsiniz");
    }
    if(sonuc>35 && sonuc<40){
        System.out.println("2.dereceden obezsiniz");
    }
    if(sonuc>40){
        System.out.println("3.dereceden obezsiniz");
    }
    }
}
