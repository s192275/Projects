public class Main {

    public static void main(String[] args) {
	Personel p1=new Personel(12554789,-8,"Abuzer");
    Ogrenci o1=new Ogrenci(1256485,4,"Erdal",1212,7);
    }
}
class Personel{
    private long TC;
    private int yas;
    private String ad;

    public Personel(long TC, int yas, String ad) {
        this.TC = TC;
        setYas(yas);
        this.ad=ad;
        ozellikleriYazdir(TC,yas,ad);
    }

    public long getTC() {
        return TC;
    }

    public void setTC(long TC) {
        this.TC = TC;
    }

    public int getYas() {
        if(yas<18){
            this.yas=18;
        }
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    void ozellikleriYazdir(long TC,int yas,String ad){
        System.out.println("Çalışan Adı: "+getAd()+" Çalışan TC: "+getTC()+" Çalışan Yaş: "+getYas());
    }
}
class Ogrenci{
    private long TC;
    private int yas;
    private String ad;
    private int okulNo;
    private int sinif;
    public Ogrenci(long TC, int yas, String ad,int okulNo,int sinif) {
        this.TC = TC;
        setYas(yas);
        this.ad=ad;
        this.okulNo=okulNo;
        this.sinif=sinif;
        ozellikleriYazdir(TC,yas,ad,okulNo,sinif);
    }

    public long getTC() {
        return TC;
    }

    public void setTC(long TC) {
        this.TC = TC;
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

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getOkulNo() {
        return okulNo;
    }
    public void setOkulNo(){
        this.okulNo=okulNo;
    }
    public int getSinif(){
        return  sinif;
    }
    public void setSinif(){
        this.sinif=sinif;
    }


    void ozellikleriYazdir(long TC, int yas, String ad,int okulNo,int sinif){
        System.out.println("Öğrenci Adı: "+getAd()+" Öğrenci TC: "+getTC()+" Öğrenci Yaş: "+getYas()+" Öğrenci OkulNo: "+okulNo+" Öğrenci Sınıf: "+sinif);
    }
}
