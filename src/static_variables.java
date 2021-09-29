import java.sql.SQLOutput;

public class static_variables {
    static int a=10;
    int b=20;
    static {
        System.out.println("Static block");

    }
    void display(){
        System.out.println("From Main");
        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+ b);

    }
}

class Test{
    public static void main(String[] args) {
        static_variables obj=new static_variables();
        obj.display();

    }
}
