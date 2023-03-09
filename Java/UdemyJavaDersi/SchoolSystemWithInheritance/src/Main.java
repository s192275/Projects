public class Main {

    public static void main(String[] args) {
	OkulIcindekiler o1=new OkulIcindekiler(-2,123456,"Mustafa");
    Ogrenciler o12=new Ogrenciler(-7,1234567,"Fırat",12,1234);
    }
}
class OkulIcindekiler{
    private int yas;
    private long TC;
    private String ad;

    public OkulIcindekiler(int yas, long TC, String ad) {
        this.yas = yas;
        this.TC = TC;
        this.ad = ad;
    }

    public int getYas() {
        if(yas<7){
            this.yas=7;
        }
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public long getTC() {
        return TC;
    }

    public void setTC(long TC) {
        this.TC = TC;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    @Override
    public String toString() {
        return "Yaş=" + yas + "TC= " + TC + "Ad=" + ad;
    }
}
class Ogrenciler extends OkulIcindekiler{
    private int sinif,okulNo;
    Ogrenciler(int yas,long TC,String ad,int sinif,int okulNo){
        super(yas,TC,ad);
        this.sinif=sinif;
        this.okulNo=okulNo;
        ozellikleriBas(yas,TC,ad,sinif,okulNo);
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }
    void ozellikleriBas(int yas,long TC,String ad,int sinif,int okulNo){
        System.out.println("Öğrenci adı: "+getAd()+" Öğrenci Yaşı: "+getYas()+" Öğrenci TC: "+getTC()+" Öğrenci Sınıfı: "+getSinif()+" Öğrenci Okul No:"+getOkulNo());
    }
}