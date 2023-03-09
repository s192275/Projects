public class Main{
    public static void main(String []args){
        GeometrikSekil g1=new Kare();
        System.out.println("Karenin alanı: "+g1.alanHesapla());
        System.out.println("Karenin çevresi: "+g1.cevreHesapla());
        GeometrikSekil g2=new Daire();
        System.out.println("Dairenin alanı: "+g2.alanHesapla());
        System.out.println("Dairenin çevresi: "+g2.cevreHesapla());
        cevreKiyasla(g1,g2);
        GeometrikSekil g3=new Dikdortgen(7);
        System.out.println("Dikdörtgenin çevresi: "+g3.cevreHesapla());
        System.out.println("Dikdörtgenin alanı: "+g3.alanHesapla());
        alanHesapla(g2,g3);
    }
    public static void cevreKiyasla(GeometrikSekil g1,GeometrikSekil g2){
        if(g1.cevreHesapla()>g2.cevreHesapla()){
            System.out.println("Karenin çevresi çemberinkinden büyüktür.");
        }
        else{
            System.out.println("Çemberin çevresi karenin çevresinden büyüktür.");
        }
    }
    public static void alanHesapla(GeometrikSekil g2,GeometrikSekil g3){
        if(g3.alanHesapla()>g2.alanHesapla()){
            System.out.println("Dikdörtgenin alanı çemberin alanından büyüktür.");
        }
        else{
            System.out.println("Çemberin alanı dikdörtgenin alanından büyüktür.");
        }
    }
}
abstract class GeometrikSekil{
    int birinciKenar;
    public int setBirinciKenar(int birinciKenar){
        this.birinciKenar=birinciKenar;
        return birinciKenar;
    }
    public int getBirinciKenar(){
        return birinciKenar;
    }
    public abstract int cevreHesapla();
    public abstract int alanHesapla();
}
class Kare extends GeometrikSekil{
    Kare(){
        setBirinciKenar(5);
    }

    public int cevreHesapla(){
        return (4*getBirinciKenar());
    }
    public int alanHesapla(){
        return (getBirinciKenar()*getBirinciKenar());
    }
}
class Daire extends GeometrikSekil{
    Daire(){
        setBirinciKenar(setBirinciKenar(5));
    }
    public int cevreHesapla(){
        return (2*(int)Math.PI*getBirinciKenar());
    }
    public int alanHesapla(){
        return ((int)Math.PI*getBirinciKenar()*getBirinciKenar());
    }
}
class Dikdortgen extends GeometrikSekil{
    int ikinciKenar;
    Dikdortgen(int ikinciKenar){
        this.ikinciKenar=ikinciKenar;
        setBirinciKenar(5);
    }
    public int cevreHesapla(){
        return 2*(birinciKenar+ikinciKenar);
    }
    public int alanHesapla(){
        return (birinciKenar*ikinciKenar);
    }
}