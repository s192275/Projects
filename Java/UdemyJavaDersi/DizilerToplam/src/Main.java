public class Main {

    public static void main(String[] args) {
        int toplam=0;
	int dizi[][]=new int[5][5];
    System.out.println("Dizi elemanları");
    for(int i=0;i< dizi.length;i++){
        for(int j=0;j<dizi[i].length;j++){
            dizi[i][j]=(int)(Math.random()*10);
            System.out.print(dizi[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i< dizi.length;i++){
        for(int j=0;j<dizi[i].length;j++){
            if(i==j || i+j== dizi.length-1){
                toplam+=dizi[i][j];
            }
        }
    }
    System.out.println("Oluşan elemanların çarprazlar toplamı: "+toplam);
    }
}
