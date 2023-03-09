public class Main {

    public static void main(String[] args) {
	int sayi1=10;
    int sayi2=20;
    int sayi3=30;
    if(sayi3>sayi2 && sayi3>sayi1){
        System.out.println("En büyük sayı üçüncü sayıdır.");
    }
   else if(sayi2>sayi3 && sayi2>sayi1){
       System.out.println("En büyük sayı ikinci sayıdır.");
    }
   else if(sayi1>sayi3 && sayi1>sayi2){
       System.out.println("En büyük sayı birinci sayıdır.");
    }
    }
}
