import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Ogrenci o1=new Ogrenci("Emre",18);
	    Ogrenci o2=new Ogrenci("Hasan",87);
	    Ogrenci o3=new Ogrenci("Ali",5);
        Ogrenci ogr[]=new Ogrenci[3];
        ogr[0]=o1;
        ogr[1]=o2;
        ogr[2]=o3;
        System.out.println("Sıralanmadan önceki haliyle öğrenciler:");
        for(Ogrenci i:ogr){
            System.out.println(i);
        }
        Arrays.sort(ogr);
    }
}
class Ogrenci implements Comparable<Ogrenci>{  //Array.sort ta Ogrenci gibi bir şey tanımlı değil dolayısıyla neye göre sıralama yapacağını bilmiyor.Biz de bu sıralamayı yaptırmak için bir interface olan Comperable ı kullandık.
    int ogrId;
    String ogrAd;
    Ogrenci(String ogrAd,int ogrId){
        this.ogrAd=ogrAd;
        this.ogrId=ogrId;
    }

    @Override
    public String toString() {
        return "Ögrenci ID:" +ogrId+ "Öğrenci Ad:" + ogrAd;
    }

    @Override //Comperable interface inin metodu olan compareTo fonksiyonu override edilmek zorundaydı biz de ettik.Numaraya göre sıraladık.
    public int compareTo(Ogrenci o) {  //compareTo metodu sayılarla çalışır biz de ona göre işlemler yaptık.
        /*if(this.ogrId<o.ogrId){
            return -1;
        }else if(this.ogrId>o.ogrId){
            return 1;
        }else{
            return 0;
        }*/ //Şimdi de isme göre sıralayalım.
        if(this.ogrAd.compareTo(o.ogrAd)<0){
            return -1;
        }else if(this.ogrAd.compareTo(o.ogrAd)>0){
            return 1;
        }else{
            return 0;
        }
    }
}