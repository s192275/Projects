import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	int []dizi=new int[10];
    for(int i=0;i< dizi.length;i++){
        System.out.println("Lütfen karesi alınacak dizi elemanlarını giriniz:");
        dizi[i]=scan.nextInt();
    }
    System.out.println("Girdiğiniz dizi elemanlarının kareleri:");
    for(int i=0;i< dizi.length;i++){
        System.out.print(Math.pow(dizi[i],2)+" ");
    }
    System.out.println("*******************************************************");
    String []aylar={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
    System.out.println("Lütfen kaçıncı ay olduğunu öğrenmek için ay değerini giriniz:");
    int ay= scan.nextInt();
    System.out.println("Seçtiğiniz ay: "+aylar[ay-1]);
    System.out.println("********************************************************");
        int secim,i;
        double toplam=0.0,ort=0.0;
        System.out.println("Kaç elemanlı dizinin ortalamasını almak istiyorsanız giriniz:");
        secim=scan.nextInt();
        int diziler[]=new int[secim];
        for(i=0;i<secim;i++){
            System.out.println("Lütfen"+(diziler[i]+i)+".eleman için sayı girişi yapınız:");
            diziler[i]=scan.nextInt();
        }
        for(i=0;i<secim;i++){
            toplam+=diziler[i];
            ort=toplam/secim;
        }
        System.out.println("Girilen dizi elemanlarının ortalaması: "+ort);
    }
}
