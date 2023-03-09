public class Main {

    public static void main(String[] args) {
	/*Canli canli=new Canli();
    canli.adiniSoyle();
    Canli kartal=new Kartal();
    kartal.adiniSoyle();
    kartal.uc();// Panda ve kartala ait olan metotlar polymorphism de çalışmaz çünkü override edilebilen metotlar üst sınıftan alt sınıfa geçer polymorphismde
        Canli panda=new Panda();
        panda.adiniSoyle();
        panda.oyna();*/
     Canli canli=new Canli();
     canli.adiniSoyle();
        Canli kartal=new Kartal();
        kartal.adiniSoyle();
        ((Kartal)kartal).uc();//Canli sınıfına ait kartal nesnesini typecasting yaparak Kartal sınıfına dönüştürdük böylece uc metodunu yazabildik.
        Canli panda=new Panda();
        panda.adiniSoyle();
        ((Panda)panda).oyna();
    }
}
class Canli{
    public void adiniSoyle(){
        System.out.println("Ben bir hayvan sınıfı nesnesiyim.");
    }
}
class Kartal extends Canli{
    public void adiniSoyle(){
        System.out.println("Ben bir kartal sınıfı nesnesiyim.");
    }
    public void uc(){
        System.out.println("Ben uçabilirim.");
    }
}
class Panda extends Canli{
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir panda sınıfı nesnesiyim.");
    }
    public void oyna(){
        System.out.println("Ben oyun oynamayı çok severim.");
    }
}