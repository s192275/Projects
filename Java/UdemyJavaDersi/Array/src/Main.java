public class Main {

    public static void main(String[] args) {
        int toplam=0;
        float ortalama;
    int dizi[]=new int[100];
    System.out.println("Dizi elemanları:");
    for(int i=0;i< dizi.length;i++){
        dizi[i]=(int)(Math.random()*100)+1;
        System.out.print(dizi[i]+" ");
        toplam+=dizi[i];
    }
    ortalama=toplam/ dizi.length;
    System.out.println("\nSistem tarafından otomatik sayılar atanan dizinin ortalaması: "+ortalama);
    System.out.println("Ortalama altında kalan dizi elemanları:");
    for(int i=0;i< dizi.length;i++){
        if(dizi[i]<(int)ortalama){
            System.out.print(dizi[i]+" ");
        }
    }
    }
}