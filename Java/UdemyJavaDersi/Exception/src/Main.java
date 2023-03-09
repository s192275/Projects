import java.util.Scanner;
class Main{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age= scan.nextInt();
        try {
            check(age); //try içerisinde check fonksiyonunu dene
        }catch (Exception e){
            System.out.println("An error occured "+e); //hata alırsan mesajı bas
        }
    }
    public static void check(int age)throws AgeException{
        if (age<18){
            throw new AgeException("You can't enter this website without being 18+"); //yaş < 18 olursa hata mesajı fırlat
        }
        else{
            System.out.println("You can go into this website...");
        }
    }
}