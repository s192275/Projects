public class Main {

    public static void main(String[] args) {
	int sayilar[]={1,9,5,2,7,9,60,120,55,-9};
    System.out.println("Selection Sort tan önce dizi:");
    diziyiBas(sayilar);
    selectionSort(sayilar);
    System.out.println("\nSelection Sort tan sonra dizi:");
    diziyiBas(sayilar);
    int sonuc=binarySearch(sayilar,55);
    System.out.println("\nSonuç: "+sonuc);
    }
    public static int binarySearch(int []sayilar,int aranacakeleman){
        int enDusukIndex=0;
        int enYuksekIndex= sayilar.length-1;
        while(enYuksekIndex>=enDusukIndex){
            int ortaIndex=(enDusukIndex+enYuksekIndex)/2;
            if(aranacakeleman<sayilar[ortaIndex]){
             enYuksekIndex=ortaIndex-1;
            }
            else if(aranacakeleman==sayilar[ortaIndex]){
                return ortaIndex;
            }
            else{
                enDusukIndex=ortaIndex+1;
            }
        }
        return -enDusukIndex-1;
    }
    public static void selectionSort(int[] sayilar) {
        for(int i=0;i< sayilar.length;i++){
            int oAnkiEnKucukSayi=sayilar[i];
            int oAnkiEnKucukElemaninIndisi=i;
            for(int j=i+1;j<sayilar.length;j++){
                if(oAnkiEnKucukSayi>sayilar[j]){
                    oAnkiEnKucukSayi=sayilar[j];
                    oAnkiEnKucukElemaninIndisi=j;
                }
            }
            if(oAnkiEnKucukElemaninIndisi!=i){
                sayilar[oAnkiEnKucukElemaninIndisi]=sayilar[i];
                sayilar[i]=oAnkiEnKucukSayi;
            }
        }
    }

    public static void diziyiBas(int[] sayilar) {
        for(int a:sayilar){
            System.out.print(a+" ");
        }
    }
}
