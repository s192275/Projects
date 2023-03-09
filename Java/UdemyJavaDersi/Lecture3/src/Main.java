import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int saniye,dakika;
    Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen bir saniye değeri girin");
    saniye=scan.nextInt();
    dakika=saniye/60;
    saniye=saniye-dakika*60;
    System.out.println("Girilen zaman dilimi : "+dakika+"dakika "+saniye+" saniye etmektedir.");
    System.out.println("****************************************");
    double fahrenheit=100;
    double celcius=(double)5/9*(fahrenheit-32);
    System.out.println("Girilen 100 Fahrenheit "+celcius+"yapmaktadır");
    System.out.println("******************************************");
    int yil;
    Scanner scan1=new Scanner(System.in);
    System.out.println("Lütfen bir yıl giriniz:");
    yil=scan1.nextInt();
    if(yil%400==0 ||yil%4==0){
        System.out.println("Girdiğiniz "+yil+" yılı artık bir yıldır.");
    }
    else{
        System.out.println("Girdiğiniz "+yil+" yılı artık bir yıl değildir.");
    }
    }
}
