import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Telefon>telefonlar=new ArrayList<>();
        Telefon tel1=new Telefon("Mi 8",3000);
        Telefon tel2=new Telefon("Mate 10 Pro",4500);
        Telefon tel3=new Telefon("Iphone X",7000);
        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);
        System.out.println("Değişikliklerden sonra:");
        telefonlar.add(0,tel3);
        telefonlar.set(3,tel2);
        telefonlar.remove(0);
        System.out.println(telefonlar.contains(tel3));
        listeyiYazdir(telefonlar);
    }
    public static void listeyiYazdir(ArrayList<Telefon> liste){
        for(int i=0;i<liste.size();i++){
            System.out.println(liste.get(i));
        }
    }
}
class Telefon{
    String model;
    int fiyat;
    Telefon(String model,int fiyat){
        this.model=model;
        this.fiyat=fiyat;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}