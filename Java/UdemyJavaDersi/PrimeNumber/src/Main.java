import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen asallık bakımından kendisine kadar asal sayı bulunacak sayıyı giriniz:");
    int sayi= scan.nextInt();
    for(int i=2;i<=sayi;i++){
        boolean state=true;
        for(int j=2;j<i;j++){
        if(i%j==0){
            state=false;
            break;
        }
        }
        if(state==true){
            System.out.print(i+" ");
        }
    }

    }
}
