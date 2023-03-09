public class Main {

    public static void main(String[] args) {
	Dikdortgen k1=new Dikdortgen(12,12);
    GeometrikSekil g1=new GeometrikSekil(12,20);
    System.out.println(g1);
    Kare k12=new Kare(7,7);
    System.out.println(k12);
    k12.ozellikYazdir(7,7);
    }
}
class GeometrikSekil{
    private int en,boy;
    GeometrikSekil(int en,int boy){
     this.en=en;
     this.boy=boy;
     alanHesapla(en,boy);
     cevreHesapla(en,boy);
    }
   GeometrikSekil(){

   }
    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
    void alanHesapla(int en,int boy){
        System.out.println(en*boy);
    }
    @Override
    public String toString(){
      return "En: "+en+" Boy: "+boy;
    }
    void cevreHesapla(int en,int boy){
        System.out.println(2*(en+boy));
    }
}
class Dikdortgen extends GeometrikSekil{

    Dikdortgen(int en, int boy) {
        setEn(en);
        setBoy(boy);
        ozellikYazdir(en,boy);
    }
    void ozellikYazdir(int en,int boy){
        System.out.println("En: "+getEn()+" Boy: "+getBoy());
        System.out.println("Çevre: "+(getEn()+getBoy())*2);
        System.out.println("Alan: "+(getBoy()*getEn()));
    }
}
class Kare extends Dikdortgen{
    Kare(int en,int boy){
        super(en,boy);
    }
}