public class Main {

    public static void main(String[] args) {
        Ogrenci ogr1[] = new Ogrenci[100];
        for (int i = 0; i < 100; i++) {
            int rastgeleID = (int) (Math.random() * 5000);
            int rastgelenot = (int) (Math.random() * 100);
            Ogrenci ogr2 = new Ogrenci(rastgelenot, rastgeleID);
            ogr1[i] = ogr2;
        }
        ogrencileriSirala(ogr1);
        for(int i=0;i<100;i++){
            ogrenciBilgileriniYazdir(ogr1);
        }
    }
    private static void ogrencileriSirala(Ogrenci[] ogr1) {
      for(int i=0;i<100;i++) {
          int oAnkiEnBuyukSayi = ogr1[i].getNott();
          int oAnkiEnBuyukSayiIndisi = i;
          for (int j = i + 1; j < ogr1.length - 1; j++) {
              if (oAnkiEnBuyukSayi < ogr1[j].getNott()) {
                  oAnkiEnBuyukSayi = ogr1[j].getNott();
                  oAnkiEnBuyukSayiIndisi = j;
              }
          }
          if (oAnkiEnBuyukSayiIndisi != i) {
              ogr1[oAnkiEnBuyukSayiIndisi] = ogr1[i];
              ogr1[i].setNott(oAnkiEnBuyukSayi);
          }
      }
    }
    public static void ogrenciBilgileriniYazdir(Ogrenci[] ogr1){
        for(int i=0;i<100;i++) {
            System.out.println("Öğrenci not: " + ogr1[i].getNott());
        }
    }
}
class Ogrenci{
    private int id,nott;
    Ogrenci(int nott,int id){
        this.nott=nott;
        this.id=id;
    }

    public int getNott() {
        return nott;
    }

    public void setNott(int nott) {
        this.nott = nott;
    }
    }