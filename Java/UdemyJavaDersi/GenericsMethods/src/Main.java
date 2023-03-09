public class Main {

    public static void main(String[] args) {
	Integer [] i={1,2,3,4,5};
    Character [] c={'a','b','c','d','e'};
    String [] s={"Sago","Kaf","Kef","Arüüü"};
    show(i);
    show(c);
    show(s);
    show2(i);
    show3(s);

    }
    public static <Arrays> void show(Arrays[] a){
        for(Arrays b:a){
            System.out.println(b);
        }
    }
    public static  <Arrays2 extends Number> void show2(Arrays2 [] b){
        for(Arrays2 c: b){
            System.out.print(c.intValue());
        }
    }
    public static  <Arrays3 extends CharSequence> void show3(Arrays3 [] b){
        for(Arrays3 c: b){
            System.out.print(c.subSequence(0,2));
        }
    }
}
