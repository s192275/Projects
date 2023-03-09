public class Main {

    public static void main(String[] args) {
	HesapMakinesi h1=new HesapMakinesi();
    System.out.println(h1.bolum(3,0));
    System.out.println(h1.carpim(5,7));
    System.out.println(h1.fark(8,-3));
    System.out.println(h1.toplam(7,11));
    HesapMakinesi h2=new HesapMakinesi(){
        public int toplam(int a,int b){
            System.out.println("İki sayının toplamı");
            super.toplam(a,b);
            return a+b;
        }
    };
    System.out.println(h2.toplam(3,5));

    }
}
class HesapMakinesi{
      public int toplam(int a,int b){
          Topla t1=new Topla();
           return  t1.topla(a,b);
      }
      public int fark(int a,int b){
          Cikar c1=new Cikar();
          return c1.cikar(a,b);
      }
      public int carpim(int a,int b){
          Carp c12=new Carp();
          return c12.carp(a,b);
      }
      public String bolum(int a,int b){
          Bol b1=new Bol();
          return b1.bol(a,b);
      }

    private class Topla{
        public int topla(int a,int b){
            return a+b;
        }
    }
    private class Cikar{
        public int cikar(int a,int b){
            return a-b;
        }
    }
    private class Carp{
        public int carp(int a,int b){
            return a*b;
        }
    }
    private class Bol{
        public String bol(int a,int b){
            if(b==0){
                return "Payda 0 olunca bölme işlemi yapılamaz!";
            }
            else{
                return String.valueOf(a/b);
            }
        }
    }
}