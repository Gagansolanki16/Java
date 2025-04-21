public class Exception17 {
    public static void main(String[] args) {
        try {
            ArithmeticException e = new ArithmeticException("Divide by zero");
            e.initCause(new NullPointerException("Null reference"));
            throw e; 
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
