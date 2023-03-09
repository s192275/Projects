public class Main {

    public static void main(String[] args) {
	String stringSayi="150";//String tipinde stringSayi adlı bir değişken tanımladık ve metni yazdık.
    int sayi=Integer.valueOf(stringSayi);//primitive bir yapı olmadığı için string value.Of ya da parse.Int komutlarıyla type casting yaptık
    int sayi2=Integer.parseInt(stringSayi);
    System.out.println("Integer değişkeni: "+sayi);//Sonuçları ekrana bastık.
    System.out.println("Integer değişkeni: "+sayi2);
    stringSayi=String.valueOf(sayi);
    String stringSayi2=String.valueOf(sayi2);
    System.out.println("String değişkenimin son değeri: "+stringSayi);
    System.out.println("String değişkenimin son değeri: "+stringSayi2);
    System.out.println("*********************************************");
    int sayia=5/3;//Sayı int olduğu için 5/3 ü int e çevirdi.Diğerlerinde de öyle
    float sayib=5f/3f;
    double sayic=5d/3d;
    System.out.println(sayia+" "+sayib+" "+sayic);
    System.out.println("***********************************************");
    System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);//Otomatik olarak kendisi double a atadığı için ve cevap 0.50000... diye gittiği için yazabildiği kadarını 0 yazıp sonsuza kadar gittiğini anlayıp yazamadığı son basamağa 1 yazıyor.
    System.out.println(1.0 - 0.9);
    System.out.println("***********************************************");
    int s1=1;
    int s2=2;
    double ortalama=(s1+s2)/2;
    System.out.println(ortalama);
    double ortalama2=(s1+s2)/2.0;
    System.out.println(ortalama2);
    System.out.println(Integer.SIZE);
    }
}
