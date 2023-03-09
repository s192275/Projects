class Main {
    public static void main(String[] args) {
        Toplayici.StringDiziYazdir nesne = new Toplayici().new StringDiziYazdir();
        String sehirler[]={"Adana", "Mersin", "Ardahan", "Ankara", "Gaziayıntep"};
       nesne.stringDiziYazdir(sehirler);
       Toplayici t1=new Toplayici();
       Toplayici.StringDiziYazdir ts1= t1.new StringDiziYazdir();
    }
}

class Toplayici {
    private int privateDegisken = 1;
    int defaultDegisken = 2;
    protected int protectedDegisken = 3;
    public int publicDegisken = 4;

    private void privateMetot() {
        StringDiziYazdir s1 = new StringDiziYazdir();
        System.out.println(s1.defaultDegiskenDahili);
        System.out.println(s1.privateDegiskenDahili);
        System.out.println(s1.protectedDegiskenDahili);
        System.out.println(s1.publicDegiskenDahili);
    }

    void defaultMetot() {
    }

    protected void protectedMetot() {
    }

    public void publicMetot() {
    }

    public class StringDiziYazdir {
        public int privateDegiskenDahili = 1;
        int defaultDegiskenDahili = 2;
        protected int protectedDegiskenDahili = 3;
        public int publicDegiskenDahili = 4;

        public void stringDiziYazdir(String[] dizi) {
            System.out.println(privateDegisken);
            System.out.println(defaultDegisken);
            System.out.println(protectedDegisken);
            System.out.println(publicDegisken);
            for (String gecici : dizi) {
                System.out.println(gecici);
            }
        }

    }

}