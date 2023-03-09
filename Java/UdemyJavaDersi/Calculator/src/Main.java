import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen hesaplama yapılması için 1.sayıyı giriniz:");
    int sayi1= scan.nextInt();
    System.out.println("Lütfen hesaplama yapılması için işlemi giriniz:");
    char islem=scan.next().charAt(0);
    System.out.println("Lütfen hesaplama yapılması için 2.sayıyı giriniz:");
    int sayi2= scan.nextInt();
        Calculator c1=new Calculator(sayi1,islem,sayi2);

    switch (islem){
        case '+':
            System.out.println("Cevap: "+c1.toplamAl(sayi1,sayi2));
            break;
        case '-':
            System.out.println("Cevap: "+c1.farkAl(sayi1,sayi2));
            break;
        case '/':
            System.out.println("Cevap: "+c1.bolumAl(sayi1,sayi2));
            break;
        case '*':
            System.out.println("Cevap: "+c1.carpimAl(sayi1,sayi2));
            break;
        default:
            System.out.println("Eksik ya da geçersiz işlem");
    }
    }
}
