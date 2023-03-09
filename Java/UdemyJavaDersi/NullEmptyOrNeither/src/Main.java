public class Main {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";
        String s3 = " ";
        System.out.println("s1 is " + isNullEmpty(s1));
        System.out.println("s1 is " + isNullEmpty(s2));
        System.out.println("s1 is " + isNullEmpty(s2));

    }

    public static String isNullEmpty(String str) {
        if (str == null) {
            return "NULL";
        } else if (str.isEmpty()) {//str.isEmpty diyerek aslında String str=new String deyip oluşan str sınıfına gidip isEmpty() ile boolean şekilde sorgulama yapıyoruz.
            return "EMPTY";
        } else {
            return "NEITHER NULL NOR EMPTY";
        }
    }
}