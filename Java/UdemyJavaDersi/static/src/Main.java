public class Main {

    public static void main(String[] args) {
	Memur m1=new Memur();
    m1.setIsim("Ali");
    m1.setMaas(5000);
    Memur m2=new Memur();
        m2.setIsim("Ayşe");
        m2.setMaas(5500);
    Memur m3=new Memur();
        m3.setIsim("Abuzer");
        m3.setMaas(6000);
        m3.bilgileriGoster();
    }
}







class Memur{
    private String isim;
    private int maas;
    static int memur=0; //private ya da public kalsaydı sadece oluşan sınıfa göre gidecekti ama biz sınıftan bağımsız bir değişken istiyoruz o yüzden static dedik
    public Memur(){
        memur++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    public void bilgileriGoster(){
        System.out.println("Oluşturulan memur nesnesi: "+memur);
    }
}
