public class Main {

    public static void main(String[] args) {
        int[] dizi={9,5,4,8,2,7,848,4848,777,987,79};
        int temp,i,j;
        System.out.println("Dizinin sıralanmamış hali:\n");
        for(int numbers:dizi){
            System.out.println(numbers);
        }
        System.out.println("Dizinin sıralanmış hali:\n");
       for(i=0;i< dizi.length-1;i++){
           for(j=0;j< dizi.length-1;j++) {
               if (dizi[j] > dizi[j + 1]) {
                   temp = dizi[j + 1];
                   dizi[j + 1] = dizi[j];
                   dizi[j] = temp;
               }
           }
       }
       for(i=0;i< dizi.length;i++){
           System.out.println(dizi[i]);
       }
    }
}
