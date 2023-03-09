import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        int row,column;
        Scanner scan = new Scanner(System.in);
			System.out.println("Mayýn Tarlasýna Hoþgeldiniz:");
			System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz:");
			System.out.println("Satýr Sayýsý: ");
			row=scan.nextInt();
			System.out.println("Sütun Sayýsý: ");
			column=scan.nextInt();
        MayinTarlasi mayin=new MayinTarlasi(row,column);
        mayin.run();

    }
}
