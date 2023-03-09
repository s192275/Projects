import java.util.ArrayList;

class Main{
     public static void main(String args[]){
     MyStack m1=new MyStack();
     Student s1=new Student("Sami","Tekinoğlu",18,123456789,153798462,"Computer Engineering",1,"F");
     System.out.println(m1.howManyElements());
     System.out.println(m1.isEmpty());
     m1.push(s1);
     m1.pop();

     }
}
class MyStack{
    private ArrayList<Object> MyArrayList=new ArrayList<>();//Dinamik bir dizi yapısı istiyor o yüzden ArrayList kullandım.Object aldım çünkü her şeyi kullanabiliriz o yüzden en kapsayıcısını aldım.
    MyStack(){
        MyArrayList=new ArrayList<>();//MyStack classı her oluşturulduğunda bir ArrayList oluşturur bu komutla
    }
    public boolean isEmpty(){
        if(MyArrayList.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int howManyElements(){
        return MyArrayList.size();
    }
    public void pop(){
        System.out.println("Top of the element about the array: "+MyArrayList.get(MyArrayList.size() -1));
        System.out.println("The proccess is over which is you wanted and the top element was removed from the array...");
    }
    public void push(Object addElement){
        MyArrayList.add(addElement);
        System.out.println("The element which is you wanted was added to the array...");
    }
    public void showElement(){
        System.out.println("The top element of array is: "+MyArrayList.get(MyArrayList.size() -1));
    }
}
class Student{
    String name,surname,division,branch;
    int age,tc,num,class1;
    Student(String name,String surname,int age,int tc,int num,String division,int class1,String branch){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.tc=tc;
        this.num=num;
        this.division=division;
        this.class1=class1;
        this.branch=branch;
    }
   void showStudent(){
        System.out.println("Name: "+name+" Surname: "+surname+" Age: "+age+" TC: "+tc+" Number: "+num+" Division: "+division+" Branch: "+branch);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", division='" + division + '\'' +
                ", branch='" + branch + '\'' +
                ", age=" + age +
                ", tc=" + tc +
                ", num=" + num +
                ", class1=" + class1 +
                '}';
    }
}