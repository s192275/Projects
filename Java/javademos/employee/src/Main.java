import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        int row,column;
        Scanner scan = new Scanner(System.in);
			System.out.println("May�n Tarlas�na Ho�geldiniz:");
			System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz:");
			System.out.println("Sat�r Say�s�: ");
			row=scan.nextInt();
			System.out.println("S�tun Say�s�: ");
			column=scan.nextInt();
        MayinTarlasi mayin=new MayinTarlasi(row,column);
        mayin.run();

    }
}
