public class Exception8 {
    public static void main(String[] args) {
       try {
          int result = Integer.parseInt("Hello");
          System.out.println(result);
       } catch (NumberFormatException e) {
          System.out.println("Exception: " + e);
       }
    }
  }
