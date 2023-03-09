public class Main {

    public static void main(String[] args) {
	Araba a1=new Araba();
    a1.motorCalistir();
    a1.motorDurdur();
    }
}
class Motor{
    private String isim;
    private int beygirGucu;
    Motor(){
        this.isim="Honda";
        this.beygirGucu=135;
        System.out.println(isim+"marka motorlu "+beygirGucu+" beygirgücüne sahip motor oluşturuldu.");

    }
}
class Araba{
    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYili;
    Araba(){
        arabaMotoru=new Motor();
        this.renk="Kırmızı";
        this.marka="Toyota";
        this.uretimYili=1999;

        System.out.println(renk+" renkli "+marka+" markalı " +uretimYili+" model araba oluşturuldu.");
    }
void motorCalistir(){
        System.out.println("Motor çalıştırıldı.");
}
void motorDurdur(){
        System.out.println("Motor durduruluyor...");
}
}