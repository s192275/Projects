import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean state=false;
        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen palindromluk bakımından sorgulanacak metni giriniz:");
        String metin=scan.nextLine();
        int ustsinir=metin.length()-1;
        for(int i=0;i<metin.length();i++){
            if(metin.charAt(ustsinir)==metin.charAt(i)){
                state=true;
            }
            else{
                break;
            }
        }
        if(state==true){
            System.out.println("Girilen metin bir palindrom metindir.");
        }
        else{
            System.out.println("Girilen metin palindrom bir metin değildir.");
        }
    }
}
