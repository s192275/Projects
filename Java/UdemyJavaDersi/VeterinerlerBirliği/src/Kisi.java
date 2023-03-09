abstract public class Kisi {
    private String isim;
    private String tcKimlik;

    public Kisi(String isim, String tcKimlik) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
    }
    abstract void kendiniTanit();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }
}
