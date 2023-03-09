public class Main {

    public static void main(String[] args) {
	A a=new A();
    B b=new B();
    a.run(b);//A uses B
        a.b=b;
    }
}
