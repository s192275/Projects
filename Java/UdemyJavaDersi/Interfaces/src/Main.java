public class Main {

    public static void main(String[] args) {
	     Calisan [] c=new Calisan[6];
         c[0]=new Programci();
         c[1]=new Pazarlamaci();
         c[2]=new Mudur();
         c[3]=new GenelMudur();
         c[4]=new AnalizProgramci();
         c[5]=new SistemProgramci();
            mesaiBasla(c);
            c[1].adiniSoyle();
    }
    public static void mesaiBasla(Calisan [] c){
        for(int i=0;i<c.length;i++){
            c[i].calis();
        }
    }
}
interface Calisan{ //Bir tane Calisan adında soyut bir sınıf oluşturduk
    public void calis(); //calis() adında bir metodu implement edilecek classlarda override edeceğimizi söyledik.
    default void adiniSoyle(){ //adiniSoyle() metodu da öyle olacaktı ama default yazınca hem override etmemize gerek kalmıyor hem de gövde ekleyebiliyoruz.
        System.out.println("Ben Calisan interface iyim...");
    }
}
class Mudur implements Calisan{
    public void calis(){
        System.out.println("Müdür çalışıyor...");
    }
}
class GenelMudur extends Mudur{
    public void calis(){
        System.out.println("Genel Müdür çalışıyor...");
    }
   public void toplantiYonet(){
        System.out.println("Genel Müdür toplantı yönetiyor...");
    }
}
class Programci implements Calisan{
    public void calis(){
        System.out.println("Programcı çalışıyor...");
    }
}
class AnalizProgramci extends Programci{
    public void analizYap(){
        System.out.println("Analiz yapılıyor...");
    }
}
class SistemProgramci extends Programci{
    public void sistemIncele(){
        System.out.println("Sistem inceleniyor...");
    }
}
class Pazarlamaci implements Calisan{
    public void calis(){
        System.out.println("Pazarlamacı çalışıyor...");
    }
}