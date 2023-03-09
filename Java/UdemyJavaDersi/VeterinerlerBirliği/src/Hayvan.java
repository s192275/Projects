abstract public class Hayvan {
    private String dogumTarihi;
    private boolean kayitli;
    Hayvan(String dogumTarihi,boolean kayitli){
        this.dogumTarihi=dogumTarihi;
        this.kayitli=kayitli;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
    public String getDogumTarihi(){
        return dogumTarihi;
    }
    public void setKayitli(boolean kayitli){
        this.kayitli=kayitli;
    }
    public boolean isKayitli(){
        return kayitli;
    }
    abstract void bilgileriGoster();
    @Override
    public String toString() {
        return "Hayvan" +
                "dogumTarihi='" + dogumTarihi + '\'' +
                ", kayitli=" + kayitli +
                '}';
    }
}
