import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> sayilar=new ArrayList<>();//Default olarak 10 eleman oldu.
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        ArrayList <String> isimler=new ArrayList<>(20);
        isimler.add("Emre");
        isimler.add("Hasan");
        isimler.add("Ali");
        ArrayList <String> isimlerYedek=new ArrayList<>(isimler);
        System.out.println(isimlerYedek);
        isimler.ensureCapacity(100);//ArrayListi verilen sayı kadar eleman tutacak şekilde arttırır
        isimler.trimToSize();//ArrayListi içindeki eleman tutacak kadar yapar
        System.out.println(isimler.size());
        System.out.println(isimlerYedek.isEmpty());
        isimler.clear();
        System.out.println(isimler.isEmpty());
        System.out.println(isimlerYedek.contains("Hasan"));
        System.out.println(isimlerYedek.contains("Fatma"));
        String [] isimlerDizisi=isimlerYedek.toArray(new String[0]);
        System.out.println(isimlerDizisi[0]);
        System.out.println(isimlerYedek.get(0));
        isimlerYedek.set(0,"Serhat");
        System.out.println(isimlerYedek.get(0));
        isimlerYedek.add(1,"Fatma");
        isimlerYedek.remove(1);
        System.out.println(isimlerYedek);
        isimlerYedek.add("Kemal");
        isimlerYedek.add("Mustafa");
        isimlerYedek.add("Can");
        List<String> yeniIsimlerListesi=isimlerYedek.subList(1,3);
        System.out.println(yeniIsimlerListesi);
        ArrayList <String> erkekIsımleri=new ArrayList<>();
        erkekIsımleri.add("Ali");
        erkekIsımleri.add("Mehmet");
        ArrayList <String> kadinIsimleri=new ArrayList<>();
        kadinIsimleri.add("Yeliz");
        kadinIsimleri.add("Alev");
        erkekIsımleri.addAll(0,kadinIsimleri);
        System.out.println(erkekIsımleri);
        String [] sehirler={"Ankara","İzmir","İstanbul"};
        List <String> sehirlerListe;
        sehirlerListe=Arrays.asList(sehirler);
        System.out.println(sehirlerListe);
        ArrayList <String> sehirler2=new ArrayList<>(Arrays.asList(sehirler));
        System.out.println(sehirler2);
        List <String> sehirler3=new ArrayList<>();
        Collections.addAll(sehirler3,sehirler);
        System.out.println(sehirler3);

    }
}
