public class Main {


    public static int recFunc(int a){
        if(a==1){
            return 1;
        }
        return a+recFunc(a-1);
    }

    public static void main(String[] args) {
    System.out.println(recFunc(10));
    }
}
