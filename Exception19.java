class parent {
    void show() throws ArithmeticException { 
        System.out.println("Parent class");
    }
}

class child extends parent {
    void show() { 
        System.out.println("Child class without exception");
    }
}

public class Exception19 {
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}
