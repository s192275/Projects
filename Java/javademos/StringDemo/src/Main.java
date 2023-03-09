import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        /*System.out.println("Metnin uzunluğu: " + mesaj.length());
        System.out.println("Metnin 5.elemani: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler=new char[25];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//İlk bulduğu a da işi bitirir.
        System.out.println(mesaj.lastIndexOf("e"));*/
        System.out.println(mesaj.replace(' ','-'));
        String yenimetin=mesaj.replace(' ','-');
        System.out.println(yenimetin);
        System.out.println(mesaj.substring(2,5));
        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
