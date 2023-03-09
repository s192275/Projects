public class Main {

    public static void main(String[] args) {
        //manuel kopyalama
	int []anaDizi={1,7,9,10};
    int kopyaDizi[]=new int[anaDizi.length];
    for(int index=0;index< anaDizi.length;index++){
        kopyaDizi[index]=anaDizi[index];
    }
    for(int numbers:kopyaDizi){
        System.out.print(numbers+" ");
    }
    System.out.println();
    //arraycopy kullanımı
    int kopyaDizi2[]=new int[anaDizi.length];
    System.arraycopy(anaDizi,0,kopyaDizi2,0,anaDizi.length);
    //diziyiBas(kopyaDizi2);
    System.out.println();
    int denemeDizisi[]=new int[anaDizi.length];
    denemeDizisi=anaDizi;
    diziyiBas(denemeDizisi);
    diziyiBas(anaDizi);
    anaDizi[0]=100;
    System.out.println("\nAna dizideki ilk eleman değiştirildi.");
    diziyiBas(anaDizi);
    System.out.println("\n**********");
    System.out.println("Deneme dizisi yazdırılıyor.");
    diziyiBas(denemeDizisi);
    tersiniYazdir(kopyaDizi2);
    int []tersiOlusturulmusDizi=tersiniYazdir(kopyaDizi2);
    diziyiBas(tersiOlusturulmusDizi);
    }

    public static int[] tersiniYazdir(int[] kopyaDizi2) {
        System.out.println();
        int olusanDizi[]=new int[kopyaDizi2.length];
        for(int i=0,j= kopyaDizi2.length-1;i< kopyaDizi2.length;i++,j--){
            olusanDizi[j]=kopyaDizi2[i];
            }
        return olusanDizi;
    }

    private static void diziyiBas(int[] kopyaDizi2) {
    for(int mugo:kopyaDizi2){
        System.out.print(mugo+" ");
    }

    }
}
