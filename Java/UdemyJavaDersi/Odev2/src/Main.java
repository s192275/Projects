public class Main {

    public static void main(String[] args) {
    Yiyecek kirmiziLahana=new Sebze("Kırmızı Lahana","Kırmızı");
    System.out.println(kirmiziLahana.getYetistigiYer());
    System.out.println(kirmiziLahana.YiyecekTuru());
    Yiyecek yesilElma=new Meyve("Yeşil Elma","Yeşil");
    System.out.println(yesilElma.getYetistigiYer());
    yesilElma.YiyecekTuru();
    meyveSebzeGoster(kirmiziLahana,yesilElma);
    }
    public static <Yiyecek>void meyveSebzeGoster(Yiyecek kirmiziLahana,Yiyecek yesilElma){
        System.out.println(kirmiziLahana+" bir sebzedir, "+yesilElma+" bir meyvedir.");
    }
}
abstract class Yiyecek{
  private String renk,isim;
  private String yetistigiYer;
  Yiyecek(){
      this.renk="Herhangi bir renk";
      this.isim="Yiyecek";
      this.yetistigiYer="Ağaç,saksı ya da toprak";
  }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setYetistigiYer(String yetistigiYer) {
        this.yetistigiYer = yetistigiYer;
    }

    public String getRenk() {
        return renk;
    }

    public String getIsim() {
        return isim;
    }

    public String getYetistigiYer() {
        return yetistigiYer;
    }
    public String YiyecekTuru(){
      return "Belirsiz";
    }
}
class Meyve extends Yiyecek{
    String isim,renk;
    Meyve(String isim,String renk){
       super();
       setIsim(isim);
       setRenk(renk);
       setYetistigiYer("Ağaç");
   }

    public String YiyecekTuru(){
        return "Meyve";
    }

    @Override
    public String toString() {
        return " "+getIsim();
    }
}
class Sebze extends Yiyecek{
   String isim,renk;
   Sebze(String isim,String renk){
       setIsim(isim);
       setRenk(renk);
       setYetistigiYer("Toprak");
   }

    public String YiyecekTuru(){
        return "Sebze";
    }

    @Override
    public String toString() {
        return ""+getIsim();
    }
}
