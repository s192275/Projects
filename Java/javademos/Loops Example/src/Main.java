public class Main {

    public static void main(String[] args) {
	double[] myList=new double[3];
    myList[0]=1.2;
    myList[1]=2.3;
    myList[2]=3.4;
    double toplam=0;
    double max=myList[0];
    for(double numbers:myList){
        if(max<numbers){
            max=numbers;
        }
        System.out.println(numbers);
    }
    for(int i=0;i<myList.length;i++){
    toplam=toplam+myList[i];
    }
    System.out.println("Toplam: "+toplam);
    System.out.println("Maksimum sayi: "+max);
    }
}
