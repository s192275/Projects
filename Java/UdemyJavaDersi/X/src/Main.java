import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen x yapmak için bir sayı seçiniz boyutu ona göre değişecektir.");
	    int secim=scan.nextInt();
        int dizi[][]=new int[secim][secim];
    for(int i=0;i< dizi.length;i++){
        for(int j=0;j<dizi[i].length;j++){
            if(i==j || i+j== dizi.length-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
    }
}
