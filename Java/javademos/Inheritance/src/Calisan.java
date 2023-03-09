public class Calisan {
    String adsoyad,eposta;
    int telefon;
    static  int girisSayisi=0;
    public static int  giris(){
        return ++girisSayisi;
    }
    Calisan(String adsoyad,String eposta,int telefon){
        this.adsoyad=adsoyad;
        this.eposta=eposta;
        this.telefon=telefon;
    }

}
