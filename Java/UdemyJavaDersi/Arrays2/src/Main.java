
public class Main {

    public static void main(String[] args) {
        int toplam=0,min=0,max=0;
	int dizi[][]=new int[2][3];
    for(int i=0;i< dizi.length;i++){
        for(int j=0;j<dizi[i].length;j++){
            dizi[i][j]=(int)(Math.random()*5)+1;
            System.out.print(dizi[i][j]+" ");
           toplam+=dizi[i][j];
        }
        System.out.println();
    }
    for(int i=0;i< dizi.length;i++){
        for(int j=0;j<dizi[i].length;j++){
            min=dizi[0][0];
            max=dizi[0][1];
            if(dizi[i][j]<min){
                dizi[i][j]=min;
            }
            if(dizi[i][j]>max){
                max=dizi[i][j];
            }

        }
    }
    System.out.println("Oluşan dizideki elemanların toplamı: "+toplam);
    System.out.println("Oluşan dizideki en küçük eleman: "+min);
    System.out.println("Oluşan dizideki en büyük eleman: "+max);
    }
}
