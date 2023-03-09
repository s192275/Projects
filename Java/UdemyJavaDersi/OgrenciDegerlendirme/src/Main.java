import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen soru sayısını giriniz:");
    int soru= scan.nextInt();
    System.out.println("Lütfen öğrenci sayısını giriniz:");
    int ogrenci= scan.nextInt();
    int dizi[][]=new int[soru][ogrenci];
    char cevapAnahtari[]=new char[soru];
    cevapAnahtariOlustur(cevapAnahtari);
    cevapOlustur();
    ogrenciCevaplariniYerlestir(dizi);
    ogrencileriDegerlendir(cevapAnahtari,dizi);

    }
    public static void ogrencileriDegerlendir(char[]cevapAnahtari,int dizi[][]){
        for(int i=0;i< dizi.length;i++){
            int dogruSayisi=0;
            for(int j=0;j<dizi[i].length;j++){
                if(dizi[i][j]==cevapAnahtari[j]){
                    dogruSayisi++;
                }
            }
            System.out.println((i+1)+".öğrencinin doğru cevap sayısı: "+dogruSayisi);
        }
    }
    public static void cevapAnahtariOlustur(char [] cevapAnahtari){
        for(int i=0;i<cevapAnahtari.length;i++){
            cevapAnahtari[i]=cevapOlustur();
        }
    }
    public static void ogrenciCevaplariniYerlestir(int [][]dizi){
    for(int i=0;i< dizi.length;i++){
        for(int j=0;j<dizi[i].length;j++){
            dizi[i][j]=cevapOlustur();
        }
    }
    }
    public static char cevapOlustur(){
        char cevap=(char)(65+(int)(Math.random()*5));
        return cevap;
    }
}
