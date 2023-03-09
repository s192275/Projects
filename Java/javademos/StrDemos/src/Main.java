import static java.lang.System.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] arrays=new int[]{1,2,3,4,5};
    int bulundumu=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen bir sayi giriniz:");
    int deger=scan.nextInt();
        for(int numbers:arrays){
        if(numbers==deger) {
            bulundumu = 1;
        }
    }
    if(bulundumu==1){
        out.println("Aranan sayı bulunmuştur.");
    }
    else{
        out.println("Aranan sayı bulunanmamıştır.");
    }
    }
}
