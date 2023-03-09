import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int sayi1,sayi2,carpim=1,i=1;
    System.out.println("Lütfen taban olacak sayıyı giriniz:");
        Scanner ceil= new Scanner(System.in);
        sayi1=ceil.nextInt();
    System.out.println("Lütfen üs olacak sayıyı giriniz:");
        Scanner exp= new Scanner(System.in);
        sayi2=exp.nextInt();
       while(i<=sayi2){
           carpim=carpim*sayi1;
           i++;
       }
       System.out.println("Cevap: "+carpim);
    }
}
