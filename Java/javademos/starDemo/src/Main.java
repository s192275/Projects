import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int stars;
    System.out.println("Lütfen kaça kadar yıldız oluşturmak istiyorsanız giriniz:");
        Scanner star=new Scanner(System.in);
        stars=star.nextInt();
        int i,j;
        for(i=1;i<=stars;i++){
            for(j=0;j<i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
