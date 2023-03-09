import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap <String,String> countries = new HashMap <String,String>(); //HashMap i oluşturduk.Özellik olarak arraylist gibidir ama hem daha kullanıcı dostudur hem de key ve value tutar.Wrapper class larla çalışır.Ya da normal class olacak
        countries.put("USA","Washington DC"); //HashMap e key ve value değerleri atadık.
        countries.put("Japan","Tokyo");
        countries.put("China","Beijing");
        countries.put("England","London");
        countries.put("Germany","Berlin");
        countries.put("Russia","Leningrad");
        countries.put("Australia","Sidney");
        countries.put("Canada","Toronto");
        countries.put("Switzerland","Oslo");
        countries.put("Azerbaijan","Baqu");
        countries.put("Turkey","Ankara");
        //countries.remove("USA"); ------> USA ı kaldırır.
        //countries.replace("USA","Miami"); -----> USA nın başkentini Miami yapar.
        //countries.clone(); ----->Kopya oluşturur.
        //countries.size(); -----> Boyut
        //countries.clear(); ----->Komple siler.
        //countries.get("USA"); -----> Washington DC yi getirir.

        for (String i : countries.keySet()){
            System.out.println(i +": "+countries.get(i));
        }
    }
}
