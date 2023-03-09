public class Calculator {
    private int sayi1,sayi2;
    private char islem;
    Calculator(int sayi1,char islem,int sayi2){
        this.sayi1=sayi1;
        this.islem=islem;
        this.sayi2=sayi2;
    }
    int toplamAl(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    int farkAl(int sayi1,int sayi2){
        return sayi1-sayi2;
    }
    int carpimAl(int sayi2,int sayi1){
        return sayi1*sayi2;
    }
    double bolumAl(int sayi1,int sayi2){
        double a= (double)sayi1;
        double b=(double)sayi2;
        if(sayi2!=0 && sayi1!=0){
            return (a/b);
        }
        return (a/b);
    }
}
