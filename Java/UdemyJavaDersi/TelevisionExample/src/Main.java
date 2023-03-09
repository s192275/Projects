import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    static Televizyon tv;
    public static void main(String[] args) {
        menuGoster();
        boolean cikis=false;
        while(cikis==false){
            System.out.println("Seçiminiz: (Menüyü görmek için sekizi tuslayınız.)");
            int secim=scan.nextInt();
            switch (secim){
                case 1:
                    tvKurVeKanallariOlustur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                 kanalDegistir();
                 break;
                case 6:
                 kanalBilgisiniGoster();
                 break;
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor...");
                    break;
                default:
                    System.out.println("0 ile 8 arasında bir değer giriniz:");
                    break;
            }
        }
    }

    private static void kanalBilgisiniGoster() {
    if(tv!=null){
        tv.aktifKanaliGoster();
    }
    else{
        System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
    }
    }

    private static void kanalDegistir() {
        if(tv!=null){
            System.out.println("Hangi kanalı görmek istiyorsunuz:");
            int acilmasiIstenenKanal=scan.nextInt();
            tv.kanalDegistir(acilmasiIstenenKanal);
        }else{
            System.out.println("TV kurun ve kanalları oluşturun");
        }
    }

    private static void sesArttir() {
        if(tv!=null){
            tv.sesArttir();
        }
        else{
            System.out.println("Önce tv ve kanalları oluşturun.");
        }
    }
    private static void sesAzalt(){
        if(tv!=null){
            tv.sesAzalt();
        }
        else{
            System.out.println("Önce tv ve kanallrı oluşturun.");
        }
    }

    private static void tvKapat() {
        if(tv!=null){
            tv.tvKapat();
        }else{
            System.out.println("Önce tvyi kurun ve kanalları oluşturun.");
        }
    }

    private static void tvAc() {
      if(tv!=null){
          tv.tvAc();
      }
      else{
          System.out.println(tv);
      }
    }

    private static void tvKurVeKanallariOlustur() {
        if(tv==null){
            scan.nextLine();
            System.out.println("Televizyonun markasını giriniz:");
            String marka=scan.nextLine();
            System.out.println("Televizyonun boyutunu giriniz:");
            String boyut=scan.nextLine();
            tv=new Televizyon(marka,boyut);
            System.out.println(tv);
        }
        else{
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        Scanner scan=new Scanner(System.in);
        System.out.println("**********MENU**********");
        System.out.println("0-Çıkış");
        System.out.println("1-Televizyonu kur");
        System.out.println("2-Televizyonu aç");
        System.out.println("3-Sesini arttır");
        System.out.println("4-Sesini azalt");
        System.out.println("5-Kanal değiştir");
        System.out.println("6-Kanal bilgisini göster");
        System.out.println("7-Televizyonu kapat");
        System.out.println("8-Menüyü göster");
    }
}
