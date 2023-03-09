public class Main {

    public static void main(String[] args) {
	ilkNesneleriOlustur();
    }

    private static void ilkNesneleriOlustur() {
        Kedi k1=new Kedi("01.01.2019",true,"Siyam Kedisi");
        Kopek k2=new Kopek("01.05.2020",false,5,"Doberman");
        k1.bilgileriGoster();
        k2.bilgileriGoster();
        Musteri m1=new Musteri("Ali Başar","123456","Ankara");
        m1.musteriyeHayvanEkle(k1);
        m1.musteriHayvanlariniListele();
        m1.kendiniTanit();
        Veteriner v1=new Veteriner("Ahmet","123456789","Ege",10);
        v1.musteriEkle(m1);
        v1.musterileriListele();
        v1.kendiniTanit();
        IlVeterinerligi i1=new IlVeterinerligi("Ankara");
        i1.sehireVeterinerEkle(v1);
        i1.sehirdekiToplamVeterinerSayisiniBul();
        YonetimPaneli<Veteriner> y1=new YonetimPaneli<>();
        y1.bilgileriGoster(v1);
    }
}
