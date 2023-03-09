import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] notes=new int[7];
    int toplam=0;
        Scanner nt1=new Scanner(System.in);
    System.out.println("Lütfen not girişi yapınız:");
    System.out.println("Lütfen Matematik notunu giriniz:");
        notes[0]=nt1.nextInt();
        System.out.println("Lütfen Fizik notunu giriniz:");
        notes[1]=nt1.nextInt();
        System.out.println("Lütfen Kimya notunu giriniz:");
        notes[2]=nt1.nextInt();
        System.out.println("Lütfen Biyoloji notunu giriniz:");
        notes[3]=nt1.nextInt();
        System.out.println("Lütfen İngilizce notunu giriniz:");
        notes[4]=nt1.nextInt();
        System.out.println("Lütfen Edebiyat notunu giriniz:");
        notes[5]=nt1.nextInt();
        System.out.println("Lütfen Tarih notunu giriniz:");
        notes[6]=nt1.nextInt();
      for(int nt:notes){
          toplam+=nt;
      }
      double ort;
      ort=toplam/notes.length;
      System.out.println("Girilen derslere ait toplam ortalama: "+ort);
    }
}
