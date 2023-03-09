public class Ogrenci {
    String isim;
    int sinif,no;
    char sube;
    boolean aktiflik;

   public Ogrenci(){
       System.out.println("Öğrenci sorgulanıyor...");
       isim="Henüz isim verilmemiş";
       sinif=0;
       no=0;
       sube='*';
       aktiflik=true;
   }
   public Ogrenci(String isim,int sinif,char sube,int no,boolean aktiflik){
       this.isim=isim;
       this.sinif=sinif;
       this.sube=sube;
       this.no=no;
       this.aktiflik=aktiflik;

   }
    public void aktiflikSorgula(){
        if(aktiflik){
            System.out.println("Ad: "+isim+" Sınıf: "+sinif+" Şube: "+sube+" No: "+no);
        }
        else{
            System.out.println("Bu öğrenci sisteme kayıtlı değildir.");
        }
    }
}
