import java.io.Serializable;
class User implements Serializable {
    String name,pass;
    public void sayHello(){
        System.out.println("Hello "+name);
    }
}


