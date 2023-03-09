public class Main {

    public static void main(String[] args) {
	Ogrenci ogr1=new Ogrenci();
        ogr1.isim="Serhat";
        ogr1.sinif=1;
        ogr1.no=22;
        ogr1.sube='A';
        ogr1.aktiflik=true;
        ogr1.aktiflikSorgula();
    Ogrenci bos=new Ogrenci();
    bos.aktiflikSorgula();
    Ogrenci ogr2=new Ogrenci("Ali",12,'A',12,true);
    ogr2.aktiflikSorgula();
    }
}
