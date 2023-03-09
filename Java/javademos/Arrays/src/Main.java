public class Main {

    public static void main(String[] args) {
        // Array tanımlamak bizi defalarca değişken tanımlamaktan kurtaracaktır.
        String[] ogrenciler=new String[5];
        ogrenciler[0]="Ali";
        ogrenciler[1]="Ahmet";
        ogrenciler[2]="Ayşe";
        ogrenciler[3]="Derin";
        ogrenciler[4]="Salih";
        for(int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }
    }
}
