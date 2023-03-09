public class Main {

    public static void main(String[] args) {
	CerceveSinif c1=new CerceveSinif();
    CerceveSinif.IcSinif i1=new CerceveSinif.IcSinif();
    i1.icSinifNesneDegiskeni=5;
    }
}
class CerceveSinif{
    int nesneDegiskeni;
    static int staticDegisken;
    public void metot(){

    }
    static void staticMetot(){}

     static class IcSinif{
    int icSinifNesneDegiskeni;
    static int icSinifStaticDegisken;
    public void icSinifMetot(){
        staticDegisken++;
        staticMetot();
    }
    static void icSinifStaticMetot(){}

    }
}