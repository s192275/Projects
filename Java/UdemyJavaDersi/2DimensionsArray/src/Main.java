public class Main {

    public static void main(String[] args) {
     int diziler[][]=new int[2][3];
     for(int i=0;i< diziler.length;i++){
         for(int j=0;j<diziler[i].length;j++){
             diziler[i][j]=(int)(Math.random()*5)+1;
         System.out.print(diziler[i][j]+" ");
         }
         System.out.println();
     }
     for(int i=0;i< diziler.length;i++){
         for(int j=0;j<diziler[i].length;j++){
             System.out.println((i+1)+".satırın "+(j+1)+". sütunundaki eleman "+diziler[i][j]+"dir.");
         }
     }
      }
}
