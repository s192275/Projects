import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kaplumbaga k1 = new Kaplumbaga();
        Tavsan t1 = new Tavsan();
        denetle(k1, t1);
        yazdir(k1, t1);
    }

    public static void denetle(Kaplumbaga k1, Tavsan t1) {
       int a= k1.kaplumbagaAdimMetodu();
        if (1 <= a && a <= 5) {
            k1.kaplumbagaBulunduguYer += 3;
        } else if (6 <= a && a <= 7) {
            k1.kaplumbagaBulunduguYer -= 6;
        } else if (8 <= a && a <= 10) {
            k1.kaplumbagaBulunduguYer += 1;
        }
        if (k1.kaplumbagaBulunduguYer <= 0) {
            k1.kaplumbagaBulunduguYer = 1;
        }
        int b=t1.tavsanAdimMetodu();
        if (1 <= b && b <= 2) {
            t1.tavsanBulunduguYer += 0;
        } else if (3 <= b && b <= 4) {
            t1.tavsanBulunduguYer += 9;
        } else if (b == 5) {
            t1.tavsanBulunduguYer -= 12;
        } else if (6 <= b && b <= 8) {
            t1.tavsanBulunduguYer += 1;
        } else if (9 <= b && b <= 10) {
            t1.tavsanBulunduguYer -= 2;
        }
        if (t1.tavsanBulunduguYer <= 0) {
            t1.tavsanBulunduguYer = 1;
        }
    }

    public static void yazdir(Kaplumbaga k1, Tavsan t1) {
            String[] dizi;
            while (k1.kaplumbagaBulunduguYer < 20 && t1.tavsanBulunduguYer < 20) {
                dizi = new String[20];
                Arrays.fill(dizi, " _ ");
                dizi[k1.kaplumbagaBulunduguYer - 1] = "K";
                dizi[t1.tavsanBulunduguYer - 1] = "T";
                if (dizi[k1.kaplumbagaBulunduguYer-1] == dizi[t1.tavsanBulunduguYer-1]) {
                    System.out.print("OUCH");
                }
                for (int i = 0; i < 20; i++) {
                    System.out.print(dizi[i]);
                }
                System.out.println();
                denetle(k1,t1);
            }
        if (k1.kaplumbagaBulunduguYer > 20 && k1.kaplumbagaBulunduguYer > t1.tavsanBulunduguYer) {
            System.out.println("Kaplumbağa kazandı olley!");
        }
        else if (t1.tavsanBulunduguYer > 20 && t1.tavsanBulunduguYer > k1.kaplumbagaBulunduguYer) {
            System.out.println("Tavşan kazandı yuh!");
        }
        else{
            System.out.println("Berabere!");
        }

        }
    }
class Kaplumbaga{
    int kaplumbagaBulunduguYer=1;
    public int kaplumbagaAdimMetodu() {
        int kaplumbagaAdim = (int) (Math.random() * 9) + 1;
        return kaplumbagaAdim;
    }
}
class Tavsan{
    int tavsanBulunduguYer=1;
    public int tavsanAdimMetodu() {
        int tavsanAdim = (int) (Math.random() * 9) + 1;
        return tavsanAdim;
    }
}