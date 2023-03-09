import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen TC kimlik numaranızı giriniz:");
    String tcKimlik=scan.nextLine();
    Tc tc=new Tc(tcKimlik);
    tc.setTc(tcKimlik);
    System.out.println(tc.getTc());

    }
}
class Tc{
    private String tc;
    char [] kimlik;
    Tc(String tcKimlik){
        this.tc=tcKimlik;
        kimlik=tc.toCharArray();
    }

    public void setTc(String tcKimlik){
        for(int i=0;i<11;i++){
            if(i<8){
           kimlik[i]='*';
            }
        }
    }
    public char[] getTc(){
        return kimlik;
    }
}