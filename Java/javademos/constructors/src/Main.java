public class Main {

    public static void main(String[] args) {
	HesapMakinesi makine1; //makine1 adında HesapMakinesi türünde bir şey oluştur.
    makine1=new HesapMakinesi(1,3); //------->Constuctor(Yapıcı) Bunu HesapMakinesi sınıfına at.
    makine1.sayi1=10;
    System.out.println(makine1.sayi1+"-"+makine1.sayi2);
    }
}
