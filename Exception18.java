class parent{
    void show(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    void show() throws ArithmeticException{
        System.out.println("Child class with unchecked exception");
    }
}
public class Exception18 {
    public static void main(String[] args) {
        child c =new child();
        c.show();
    }
} 
