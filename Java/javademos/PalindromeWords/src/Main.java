import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String kelime,temp="";
    int i;
    System.out.println("Lütfen palindrom olup olmama bakımından sorgulanacak kelimeyi giriniz:");
    Scanner input=new Scanner(System.in);
    kelime=input.next();
    for(i=kelime.length()-1;i>=0;i--){
        temp=temp+kelime.charAt(i);
    }
    System.out.println(temp);
    if(temp.equals(kelime)){
        System.out.println("Girilen kelime bir palindromdur.");
    }
    else{
        System.out.println("Girilen kelime bir palindrom değildir.");
    }
    }
}
