import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private boolean acik;
    private int aktifKanal=1;
    private int ses;
    private ArrayList<Kanal> kanallar;
    public void setMarka(String marka){
        this.marka=marka;
    }
    public void aktifKanaliGoster(){
        if(acik)
        System.out.println("Aktif Kanal: "+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
        else
            System.out.println("Öncelikle televizyonu açınız.");
    }
    public void setBoyut(String boyut){
        this.boyut=boyut;
    }
    public void kanalDegistir(int acilmasiIstenenKanal){
        if(acik){if(acilmasiIstenenKanal!=aktifKanal){
            if(acilmasiIstenenKanal<=kanallar.size() && acilmasiIstenenKanal >=0){
                aktifKanal=acilmasiIstenenKanal;
                System.out.println("Kanal: "+acilmasiIstenenKanal+" Bilgi: "+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
            }
        }
        }else{
            System.out.println("Önce televizyonu açınız.");
        }
    }
    public String getBoyut(){
        return boyut;
    }
    public String getMarka(){
        return marka;
    }
    public void tvAc(){
        if(acik==false){
            acik=true;
            System.out.println("TV açıldı.");
        }else{
            System.out.println("TV zaten kapalı");
        }
    }
    public void tvKapat(){
        if(acik==true){
            System.out.println("TV kapandı.");
        }
        else{
            System.out.println("TV zaten kapalı.");
        }
    }
    public void sesArttir(){
        if(ses<20 && acik==true){
            ses++;
            System.out.println("Ses seviyesi: "+ses);
        }
        else{
            System.out.println("Ses maksimumda olduğu için arttıramazsınız ya da TV kapalı.");
        }
    }
    public void sesAzalt(){
        if(ses>0 && acik){
            ses--;
            System.out.println("Ses seviyesi: "+ses);
        }else{
            System.out.println("Ses minimumda daha fazla azaltamazsınız ya da TV kapalı.");
        }
    }
    Televizyon(String marka,String boyut){
          this.marka=marka;
          this.boyut=boyut;
          kanallariOlustur();
          this.acik=false;
          kanallar=new ArrayList<>();
          ses=10;
    }

    private void kanallariOlustur() {
        HaberKanali cnn=new HaberKanali("CNN",1,"Genel Haber");
        kanallar.add(cnn);
        MuzikKanali dreamturk=new MuzikKanali("DreamTurk",2,"Yerli");
        kanallar.add(dreamturk);
        HaberKanali bein=new HaberKanali("Beinsprot",3,"Spor Haber");
        MuzikKanali numberone=new MuzikKanali("NumberOne",4,"Müzik Haber");
        kanallar.add(numberone);

    }

    @Override
    public String toString() {
        return "Marka: "+ marka + " Boyut:" + boyut;
    }
}
