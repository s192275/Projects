import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	String a=new String("Abuzer");
    String b=new String("Abuzer");
    System.out.println(a.equals(b));//Normal equals metodunda adreslere bakar ama String le diğer primitive tiplerde bir istisna vardır.Override edilmiş metodu kullanırlar.
    Kisi k1=new Kisi(5,"emre");
    System.out.println(k1);
    Kisi k2=new Kisi(5,"emre");
    System.out.println(k2);
    System.out.println(k1.equals(k2));
    System.out.println("k1 hashcode: "+k1.hashCode()+" k2 hashcode: "+k2.hashCode());

    }
}class Kisi extends Object{
    int id;
    String isim;
    public Kisi(int id,String isim){
        this.id=id;
        this.isim=isim;
    }

    @Override
    public String toString() {
        return "id=" + id +" isim=" + isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//gelen bütün objecte bağlı nesneyi al ilgili sınıfla karşılaştır doğruysa true dön
        if (o == null || getClass() != o.getClass()) return false;//farklı classların üyesiyse false dön
        Kisi kisi = (Kisi) o;//ikisi de aynı class sa objectten kisi ye çek
        return id == kisi.id && Objects.equals(isim, kisi.isim);//benzerlikleri sorgula ve true dön
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }
}
