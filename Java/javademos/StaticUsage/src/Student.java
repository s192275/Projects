public class Student {
    public int id;
    public String name;
    public int point;
    private static int counter=0;//this. demedik çünkü bu nesneye ait değil sınıfa ait

    Student(String name,int id,int point){
        this.name=name;
        this.id=id;
        this.point=point;
        Student.counter++;
    }
    public void exit(){
        Student.counter--;
    }
    public static int howManyStudent(){
        return Student.counter;
    }
    public static double calcOverAll(int[] arr){
        double overall=0;
        for(int i=0;i<arr.length;i++){
            overall+=arr[i];
        }
        return overall/ arr.length;
    }
}
