public class Main {

    public static void main(String[] args) {
	Hayvan h1=new Hayvan(4);
    Kopek k1=new Kopek(4,"Golden");
    Kedi ke1=new Kedi(4,"Kedi","Van Kedisi");
    System.out.println(ke1);
    adiniSoyle(h1);
    adiniSoyle(k1);
    adiniSoyle(ke1);
    }
    public static void adiniSoyle(Hayvan h){
        h.adiniSoyle();
    }
}
class Hayvan{
    private int ayakSayisi;

    public Hayvan(int ayakSayisi) {
        this.ayakSayisi=ayakSayisi;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
    public void adiniSoyle(){
        System.out.println("Ben hayvan sınıfı nesnesiyim");
    }
}
class Kopek extends Hayvan{
    private String tur;
    public Kopek(int ayakSayisi,String tur){
        super(ayakSayisi);
        this.tur=tur;
    }

    @Override
    public void adiniSoyle() {
       System.out.println("Ben bir köpek nesnesiyim");
    }

    @Override
    public String toString() {
        return "Ben bir köpek nesnesiyim";
    }
}
class Kedi extends Kopek{
    private String cins;
    Kedi(int ayakSayisi,String tur,String cins){
        super(ayakSayisi,tur);
        this.cins=cins;
    }

    @Override
    public String toString() {
        return "Ben bir kedi nesnesiyim";
    }
}