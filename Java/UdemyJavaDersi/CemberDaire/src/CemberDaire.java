public class CemberDaire {
    double sayi1,sayi2;
    CemberDaire(double sayi1,double sayi2){
        this.sayi1=sayi1;
        this.sayi2=sayi2;
        cemberCevreAl();
        daireAlanAl(sayi2);
    }
    void cemberCevreAl(){
        System.out.println("Çevresi alınması için girilen çemberin çevresi: "+(2*(Math.PI)*sayi1)+" kadardır.");
    }
    void daireAlanAl(double sayi2){
        System.out.println("Alanı alınması için girilen dairenin alanı: "+(Math.PI)*(Math.pow(sayi2,2))+" kadardır.");
    }
}
