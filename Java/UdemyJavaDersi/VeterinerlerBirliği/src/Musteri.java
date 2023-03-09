import java.util.ArrayList;

public class Musteri extends Kisi{
    private String adres;
    private ArrayList<Hayvan> musteriHayvanlari;
    public Musteri(String isim,String tcKimlik,String adres){
        super(isim,tcKimlik);
        this.adres=adres;
        musteriHayvanlari=new ArrayList<>();
    }
    public void musteriyeHayvanEkle(Hayvan h){
        this.musteriHayvanlari.add(h);
        System.out.println("Hayvan "+getIsim()+" müşterisine eklendi...");
    }

    public String getAdres() {
        return adres;
    }
    public void musteriHayvanlariniListele(){
        for(Hayvan h: musteriHayvanlari){
            System.out.println(h);
        }
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    void kendiniTanit(){
        System.out.println(toString()+ "Ben bir müşteriyim...");
    }

    @Override
    public String toString() {
        return super.toString()+"Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
