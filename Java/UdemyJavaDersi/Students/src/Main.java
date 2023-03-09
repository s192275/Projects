public class Main {

    public static void main(String[] args) {
	Students s1[]=new Students[100];
    notlandir(s1);
    }
    public void notlandir(int[] s1) {
        for (int i = 0; i < s1.length; i++) {
            s1[i] = (Math.random() * 100) + 1;
            System.out.println(s1[i]);
        }
    }
}
