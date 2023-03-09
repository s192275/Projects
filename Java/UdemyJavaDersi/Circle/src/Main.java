import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Çemberin çevresi ve dairenin alanının hesaplanması için yarıçap değeri giriniz:");
    int yaricap=scan.nextInt();
    CemberDaire c1=new CemberDaire(yaricap);
    }
}
class CemberDaire {
    private int yaricap;
    CemberDaire(int yaricap){
        this.yaricap=yaricap;
        cemberHesapla(yaricap);
        daireHesapla(yaricap);
    }
    void cemberHesapla(int yaricap){
        System.out.println("Yarıçapı girilen çemberin çevresi: "+(2*Math.PI*yaricap));
    }
    void daireHesapla(int yaricap){
        System.out.println("Yarıçapı girilen dairenin alanı: "+(Math.PI*Math.pow(yaricap,2)));
    }
}