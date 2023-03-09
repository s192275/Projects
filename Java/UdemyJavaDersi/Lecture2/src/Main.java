public class Main {

    public static void main(String[] args) {
	int sayi1=10;//sayi1 in değeri 10 oldu.
    int sayi2=++sayi1;//sayi2 nin değeri önce sayi1 e bir eklemek sonra basmak olduğu için 11 oldu
    int sayi3=sayi1--;//sayi3 ün değeri önce yazıp sonra 1 azaltmak olduğu için 11 oldu ve sayi1 10 oldu
    System.out.println("Sonuç: " +(sayi1)+(--sayi2)+(sayi3++));//Öncelikle burada string olarak basılır çünkü böyle bir ifadede herhangi bir metin bile olsa sistem onu metin olarak algılıyor + toplama metodu değil.
        //Ondan sonra önce sayi1 i bastık en son 10 du.Sonra önce sayi2 yi azalttık sonra bastık 10 oldu.Sonra sayi3 ü basıp sonra arrttırdık dolayısıyla sayi3 11 oldu.
    System.out.println("Sonuç: "+((sayi1)+(--sayi2)+(sayi3++)));//Burada da toplamlarını aldık.10+10+11=31 oldu.
    System.out.println("****************************************");
    int sayi11=10;
    int sayi22=20;
    int sonuc=0;
    sonuc+=sayi11;
    System.out.println("Sonuç:" +sonuc);
    sonuc-=sayi22;
    System.out.println("Sonuç:" +sonuc);
    sonuc*=sayi11;
    System.out.println("Sonuç:" +sonuc);
    sonuc/=sayi11;
    System.out.println("Sonuç:" +sonuc);
    System.out.println("*****************************************");
int s1=10;
int s2=6;
s1++;//altındaki satırda yazdırma olmadığı için yazdıracak bir şeyi yok dolayısıyla arttırma yapacak
--s2;
s1*=--s2;
System.out.println("s1'in son değeri: "+s1);
System.out.println("s2'nin son değeri: "+s2);

   int ssayi1=15;
   int ssayi2=5;
   int ssayi3=0;
   int ssonuc=(ssayi1*ssayi2+4/2)+ssayi1++*ssayi2+ssayi1;
   System.out.println(ssonuc);

    }
}
