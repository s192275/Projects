public class Main {

    public static void main(String[] args) {
	String isim= new String("emre");
    String isim2=new String("emre");
    System.out.println(isim==isim2);//false verdi çünkü referansların adreslerine baktı.
    System.out.println(isim.equals(isim2));//true verdi çünkü equals metodu normalde adrese bakar primitive type de ve Stringlerde içeriğe bakar.
    String abc="abc";
    //String def="abc";
    //String fgh="abc";
    //String hıi="abc";//Hepsi abc nin tuttuğunu tutar aynı içerikte farklı alanlar açılmaz ve bellekten tasarruf edilir.
    //System.out.println(abc==def);//true verdi çünkü soldaki gösterim String poolda tutulur ve burada içeriğe bakılır içerikleri de aynıdır.
     abc="emre";
     System.out.println(abc);
     //System.out.println(abc==def);//false verdi çünkü emre kaldı yeni bir string oluştu emre altunbilek diye onu kıyasladı emre de çöpe gitti.
     abc.concat("altunbilek");
     System.out.println(abc);//emre verdi çünkü o emreyi tutuyor başka bir yerde onun tuutğu emre kopyalandı sonuna altunbilek eklendi ve farklı adreste de o tutuluyor.
     String yeni=abc.concat("altunbilek");
     System.out.println(yeni);
     System.out.println(isim==abc);//false verir adresler farklı birisi class içindeyken birisi String pool içinde
     String isim3=new String("emre").intern();
     System.out.println(isim3==abc);//true verdi çünkü isim3 referansı hem bir class ı tutuyor hem de intern komutuyla String pool un içine girdi.
    }
}
