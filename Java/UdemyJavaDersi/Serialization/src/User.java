import java.io.Serializable;

public class User implements Serializable {
    String name,pass;
    public void sayHello(){
        System.out.println("Hello "+name);
    }
}
