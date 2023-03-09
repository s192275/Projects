public class Main{
    public static void main(String[] args) {
       Ogrenci tumOgrenciler[]=new Ogrenci[100];
       for(int i=0;i<100;i++){
           int rastgeleID=(int)(Math.random()*5000);
           int rastgelenotDegeri=(int)(Math.random()*100);
           Ogrenci yeni=new Ogrenci(rastgeleID,rastgelenotDegeri);
           tumOgrenciler[i]=yeni;
       }

      ogrencileriNotlarinaGoreSirala(tumOgrenciler);
       for(int i=0;i<100;i++){
         tumOgrenciler[i].ogrenciBilgileriniYazdir();
       }
    }

    private static void ogrencileriNotlarinaGoreSirala(Ogrenci[] tumOgrenciler) {
            for(int i=0;i<tumOgrenciler.length -1;i++){
                int oAnkiEnBuyukSayi=tumOgrenciler[i].getNotDegeri();
                int oAnkiElemaninEnBuyukIndex=i;
                for(int j=i+1;j< tumOgrenciler.length;j++){
                    if(oAnkiEnBuyukSayi<tumOgrenciler[j].getNotDegeri()){
                        oAnkiEnBuyukSayi=tumOgrenciler[j].getNotDegeri();
                        oAnkiElemaninEnBuyukIndex=j;
                    }
                }
                if(oAnkiElemaninEnBuyukIndex!=i){
                    tumOgrenciler[oAnkiElemaninEnBuyukIndex]=tumOgrenciler[i];
                    tumOgrenciler[i].setNotDegeri(oAnkiEnBuyukSayi);
                }
            }


    }
}

class Ogrenci{
    private int id;
    private int notDegeri;
    Ogrenci(int id,int notDegeri){
        this.id=id;
        this.notDegeri=notDegeri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotDegeri() {
        return notDegeri;
    }

    public void setNotDegeri(int notDegeri) {
        this.notDegeri = notDegeri;
    }
   public void ogrenciBilgileriniYazdir(){
        System.out.println("ID: "+id+" Not: "+notDegeri);
   }
}