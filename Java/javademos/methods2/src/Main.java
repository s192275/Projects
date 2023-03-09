public class Main {

    public static void main(String[] args) {
	String mesaj="Bugün hava çok güzel";
    String yenimesaj=mesaj.substring(0,2);
    System.out.println(yenimesaj);
    System.out.println("Toplam: "+toplam(5,7));
    System.out.println("Sehir: "+sehir());
    }
    public static void ekle(){
        System.out.println("Eklendi.");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int toplam(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehir(){
        return "Ankara";
    }
}
