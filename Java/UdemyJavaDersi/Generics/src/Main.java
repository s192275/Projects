public class Main {

    public static void main(String[] args) {
	Integer [] nums={1,2,3,4,5};
    String [] strings={"Ali","Ahmet","Mehmet","Sago","Kaf","Kef"};
    Character [] c={'a','b','c','d','e','f'};
    ShowArray<Integer> s1=new ShowArray<>();
    s1.show(nums);
    ShowArray<String> s2=new ShowArray<>();
    s2.show(strings);
    ShowArray<Character>s3=new ShowArray<>();
    s3.show(c);
    }
}
class ShowArray <Arrays>{
    public void show(Arrays [] a) {
        for (Arrays b : a) {
         System.out.print(" "+b);
        }
    }
}
