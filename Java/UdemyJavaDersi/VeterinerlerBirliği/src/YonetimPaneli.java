public class YonetimPaneli <T>{
    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }
    public <T extends Musteri>void sahipOlduguHayvanlariGoster(T musteri){
        musteri.musteriHayvanlariniListele();
    }
    public <T extends Veteriner>void veterinerGoster(T veteriner){
        veteriner.kendiniTanit();
    }
}
