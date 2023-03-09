import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0;
	String kullaniciAdi,kullaniciParola,girisAdi,girisParola;
    System.out.println("Lütfen kullanıcı adı oluşturun ve girin:");
        Scanner userName= new Scanner();
        kullaniciAdi= userName.next();
    System.out.println("Lütfen parola oluşturun ve girin:");
        Scanner userPass= new Scanner();
        kullaniciParola= userPass.next();
        while(kullaniciAdi[i]=='$' && kullaniciParola.length()<8 || kullaniciParola.length()>16){
            System.out.println("Oluşturulan parola ya da kullanıcı adı uygun değildir lütfen kullanıcı adını ve parolayı baştan giriniz:");
            Scanner userName4= new Scanner();
            kullaniciAdi= userName4.next();
            Scanner userPass4= new Scanner();
            kullaniciParola= userPass4.next();
            i++;
        }
        System.out.println("Oluşturulan kullanıcı adı ve şifre başarılıdır.Lütfen sisteme yeniden giriş yapınız:");
        Scanner userName2= new Scanner();
        girisAdi= userName2.next();
        Scanner userPass2= new Scanner();
        girisParola= userPass2.next();
        while(girisAdi!=kullaniciAdi || girisParola!=kullaniciParola ){
            System.out.println("Girilen kullanıcı adı ve parola eşleşmedi.Lütfen tekrar giriniz:");
            Scanner userName3= new Scanner();
            kullaniciAdi= userName3.next();
            Scanner userPass3= new Scanner();
            kullaniciParola= userPass3.next();
        }
    }
}
