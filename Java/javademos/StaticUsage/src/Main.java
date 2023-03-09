public class Main {

    public static void main(String[] args) {
        System.out.println("Online Öğrenci: "+Student.howManyStudent());
        Student s1=new Student("Ali",220,90);
        System.out.println("Online Öğrenci: "+Student.howManyStudent());
        Student s2=new Student("Ayşe",330,100);
        System.out.println("Online Öğrenci: "+Student.howManyStudent());
        Student s3=new Student("Mehmet",440,60);
        s1.exit();
        System.out.println("Online Öğrenci: "+Student.howManyStudent());

        int[] notes=new int[3];
        notes[0]=s1.point;
        notes[1]=s2.point;
        notes[2]=s3.point;
        System.out.println(Student.calcOverAll(notes));
    }
}
