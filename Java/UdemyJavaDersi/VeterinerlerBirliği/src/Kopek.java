public class Kopek extends Hayvan{
    private int asiSayisi;
    private String cins,tur;
    public Kopek(String dogumTarihi, boolean kayitli,int asiSayisi,String cins){
        super(dogumTarihi, kayitli);
        this.asiSayisi=asiSayisi;
        this.tur="Köpek";
        this.cins=cins;
    }

    public int getAsiSayisi() {
        return asiSayisi;
    }

    public void setAsiSayisi(int asiSayisi) {
        this.asiSayisi = asiSayisi;
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "asiSayisi=" + asiSayisi +"Cins ="+cins+
                '}';
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString()+" "+super.toString());
    }
}
