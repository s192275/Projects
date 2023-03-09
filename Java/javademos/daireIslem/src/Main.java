import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 double pi=3.14,yaricap,alan,cevre;
     System.out.println("Lütfen dairenin alan ve çevresinin hesaplanması için yarıçapını giriniz");
        Scanner input= new Scanner(System.in);
        yaricap=input.nextDouble();
        alan=yaricap*pi*yaricap;
        cevre=yaricap*2*pi;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre );
    }
}
