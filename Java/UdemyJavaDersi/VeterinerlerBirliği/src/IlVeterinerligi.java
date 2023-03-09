import java.util.ArrayList;

public class IlVeterinerligi {
    private String sehir;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public IlVeterinerligi(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler=new ArrayList<>();
    }
    public void sehireVeterinerEkle(Veteriner veteriner){
        sehirdekiVeterinerler.add(veteriner);
    }
    public void sehirdekiToplamVeterinerSayisiniBul(){
        System.out.println("Toplam veteriner sayısı: "+sehirdekiVeterinerler.size());
    }
}
