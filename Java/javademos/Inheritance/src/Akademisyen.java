public class Akademisyen extends Calisan{
    String bolum,gorevler;
    String dersler;
    public void derseGir(){
        System.out.println("Derse girildi!");
    }
    Akademisyen(String adsoyad,String eposta,int telefon,String bolum,String gorevler,String dersler){
        super(adsoyad, eposta, telefon);
    }
}
