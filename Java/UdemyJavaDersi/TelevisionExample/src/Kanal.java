import java.util.ArrayList;

public class Kanal {
    private String ad;
    private int kanalNo;
    private ArrayList<Kanal> kanallar;
    public Kanal(String ad, int kanalNo) {
        this.ad = ad;
        this.kanalNo = kanalNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }
    public String kanalBilgisiniGoster(){
        return "Kanal: "+ad+"Numarası: "+kanalNo;
    }
}
