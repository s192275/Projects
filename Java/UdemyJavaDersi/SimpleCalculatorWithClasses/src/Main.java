import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen işlem yapacağınız 1.sayıyı giriniz:");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen işlem yapacağınız işareti giriniz:");
        char isaret=scan.next().charAt(0);
        System.out.println("Lütfen işlem yapacağınız ikinci sayıyı giriniz");
        int sayi2=scan.nextInt();
        Calculator c1=new Calculator(sayi1,isaret,sayi2);
        switch (isaret){
            case '+':
                c1.topla(sayi1,sayi2);
                break;
            case '-':
                c1.fark(sayi1,sayi2);
                break;
            case '*':
                c1.carpim(sayi1,sayi2);
                break;
            case '/':
                c1.bolum(sayi1,sayi2);
                break;
            default:
                System.out.println("Geçersiz işlem");
        }
    }
}
class Calculator{
   private int sayi1,sayi2;
    private char isaret;
    Calculator(int sayi1,char isaret,int sayi2){
        this.sayi1=sayi1;
        this.isaret=isaret;
        this.sayi2=sayi2;
    }

    public char getIsaret() {
        return isaret;
    }

    public int getSayi1() {
        return sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }
    void topla(int sayi1,int sayi2){
        System.out.println("Girilen sayıların toplamı: "+(sayi1+sayi2));
    }
    void fark(int sayi1,int sayi2){
        System.out.println("Girilen sayıların farkı: "+(sayi1-sayi2));
    }
    void carpim(int sayi1,int sayi2){
        System.out.println("Girilen sayıların çarpımı: "+(sayi1*sayi2));
    }
    void bolum(int sayi1,int sayi2){
        System.out.println("Girilen sayıların bölümü: "+((double)sayi1/(double)sayi2));
    }

}