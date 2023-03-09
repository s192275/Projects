import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double number;
    double total=0.0;
    System.out.println("Please enter the number to calculate the harmonic sum");
        Scanner num=new Scanner(System.in);
        number=num.nextDouble();
        while(number>=1){
            total=total+(1/number);
            number--;
        }
    System.out.println("Total answer is: "+total);
    }
}
