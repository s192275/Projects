import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    int number;
    int luckyNumber=(int)(Math.random()*99)+1;
   int birler=luckyNumber%10;
   int onlar=(luckyNumber-birler)/10;
   int tersi=birler*10+onlar;
    System.out.println("Lütfen sistem tarafından oluşturulan sayıyı tahmin etmek için sayınızı giriniz:");
   number=scan.nextInt();
        int birler1=number%10;
        int onlar1=number/10;
   if(number==luckyNumber){
       System.out.println("Tebrikler tam 1 milyon TL kazandınız.");
   }
   if(birler1==birler || onlar1==onlar || birler==birler1 || onlar==onlar1){
       System.out.println("Tebrikler tam 100 bin TL kazandınız.");
   }
   if(number==tersi){
       System.out.println("Tebrikler tam 150 bin TL kazandınız.");
   }
    }
}
