public class KodBloklari {
    public static void main(String[] args) {
        int seviye1Blok1=1;//Bu int değeri bütün bir main fonksiyonunun scope una girdiği için her yerde tanımlanabilir.
        {
            System.out.println(seviye1Blok1);
            int seviye2Blok1=21;//Bu int değeri tanımlı olduğu scope ta gözükür
            {
                System.out.println(seviye2Blok1);
            }

            int seviye3Blok1=3;//Üstteki gibi
            {
                System.out.println(seviye3Blok1);
            }
        }
        int seviye4Blok2=5;//Bunun scopunda hepsini kapsayan seviye1Blok1 ve seviye4Blok 2 gözükür çünkü diğerlerinin scope alanı kapanmıştır.
        {
            System.out.println(seviye4Blok2);
        }
    }
}
