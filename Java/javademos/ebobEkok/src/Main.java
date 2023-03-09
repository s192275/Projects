import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ekok=0,ebob=0,sayi1,sayi2,i;
        int buyuksayi,kucuksayi;
        System.out.println("Lütfen EBOB EKOK hesaplanması bakımından birinci sayıyı giriniz:");
        Scanner num1=new Scanner(System.in);
        sayi1=num1.nextInt();
        System.out.println("Lütfen EBOB EKOK hesaplanması için ikinci sayıyı giriniz:");
        Scanner num2=new Scanner(System.in);
        sayi2=num2.nextInt();
        buyuksayi=sayi1;
        kucuksayi=sayi2;
    if(sayi1>sayi2){
        sayi1=buyuksayi;
        sayi2=kucuksayi;
    }
    else{
        sayi1=kucuksayi;
        sayi2=buyuksayi;
    }

    for(i=2;i<=kucuksayi;i++){
        if(buyuksayi%i==0 && kucuksayi%i==0){
            ekok=buyuksayi;
            ebob=kucuksayi;
            break;
        }
        else{
            ekok=buyuksayi*kucuksayi;
            ebob=1;
            break;
        }
    }
   System.out.println("EKOK: "+ekok);
    System.out.println("EBOB: "+ebob);
}
}