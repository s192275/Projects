import java.util.Scanner;

public class ID {
    Scanner scan=new Scanner(System.in);
    private String a[]=new String[11];
    public ID(){
        System.out.println("Lütfen TC kimlik numaranızı giriniz:");
        for(int i=0;i< a.length;i++){
            a[i]= scan.next();
        }
    }
    public void seta(String a[]){
        for(int i=0;i<11;i++){
            if(i<9){
                System.out.print("*");
            }
            else{
                System.out.print(a[i]+"");
            }
        }
    }
}
