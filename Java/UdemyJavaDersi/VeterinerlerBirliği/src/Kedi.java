public class Kedi extends Hayvan{
    private String tur,cins;
    Kedi(String dogumTarihi, boolean kayitli,String cins){
        super(dogumTarihi, kayitli);
        this.tur="Kedi";
        this.cins=cins;
    }
    void bilgileriGoster(){
        System.out.println(toString()+ "Kayıtlı mı: "+isKayitli()+ "Doğum Tarihi: "+getDogumTarihi());
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
