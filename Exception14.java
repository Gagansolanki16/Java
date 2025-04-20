public class Exception14 {
  public static void main(String[] args) {
    try {
        System.out.println(10 / 0);
    } catch (NullPointerException e) {
        System.out.println(e);
    }
    finally{
        System.out.println("Finally block executed");
    }
  }
}
