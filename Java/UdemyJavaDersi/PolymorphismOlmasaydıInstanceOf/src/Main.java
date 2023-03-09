public class Main {

    public static void main(String[] args) {
	GeometrikSekil g1=new GeometrikSekil(7,8);
    GeometrikSekil g2=new Dikdortgen(4,5);
    GeometrikSekil g3=new Kare(3,4);
    g1.alanHesapla(7,8);
    g2.alanHesapla(4,5);
    g3.alanHesapla(3,4);
    alaniGoster(g1);
    alaniGoster(g2);
    alaniGoster(g3);
    }
    public static void alaniGoster(GeometrikSekil sekil){
        if(sekil instanceof Kare){
            System.out.println("Kare");
        }
        else if(sekil instanceof Dikdortgen){
            System.out.println("Dikdörtgen");
        }
        else{
            System.out.println("Geometrik şekil");
        }
    }
}
class GeometrikSekil{
    private int en;
    private int boy;
    GeometrikSekil(int en,int boy){
        this.en=en;
        this.boy=boy;
        System.out.println("Geometrik şekil oluşturuluyor");
    }

    public int getEn() {
        return en;
    }

    public int getBoy() {
        return boy;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
    public static void alanHesapla(int en,int boy){
        System.out.println("Alan: "+(en*boy));
    }
    public static void cevreHesapla(int en,int boy){
        System.out.println("Çevre: "+((en+boy)*2));
    }
}
class Dikdortgen extends GeometrikSekil{
    Dikdortgen(int en,int boy){
        super(en,boy);
    }
}
class Kare extends Dikdortgen{
    Kare(int en,int boy){
        super(en,boy);
        setEn(boy);
    }
    public static void alanHesapla(int en,int boy){
        System.out.println("Alan: "+(en*boy));
    }
    public static void cevreHesapla(int en,int boy){
        System.out.println("Çevre: "+((en+boy)*2));
    }
}