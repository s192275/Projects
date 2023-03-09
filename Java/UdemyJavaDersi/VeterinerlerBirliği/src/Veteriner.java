import java.util.ArrayList;

public class Veteriner extends Kisi{
    private String mezunOlduguOkul;
    private int calismaSuresi;
    private int musteriSayisi=0;
    private ArrayList<Musteri> veterinerMusterileri;
    public Veteriner(String isim,String tcKimlik,String mezunOlduguOkul,int calismaSuresi){
        super(isim, tcKimlik);
        this.mezunOlduguOkul=mezunOlduguOkul;
        this.calismaSuresi=calismaSuresi;
        veterinerMusterileri=new ArrayList<>();
    }
    public void musteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
    }
    public void musterileriListele(){
        for(Musteri m: veterinerMusterileri){
            m.kendiniTanit();
        }
    }
    public int getCalismaSuresi() {
        return calismaSuresi;
    }

    public void setCalismaSuresi(int calismaSuresi) {
        this.calismaSuresi = calismaSuresi;
    }

    public String getMezunOlduguOkul() {
        return mezunOlduguOkul;
    }

    public void setMezunOlduguOkul(String mezunOlduguOkul) {
        this.mezunOlduguOkul = mezunOlduguOkul;
    }
    void kendiniTanit(){
        System.out.println(toString()+" Ben bir veterinerim...");
    }
    @Override
    public String toString() {
        return super.toString()+ "Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }
}
