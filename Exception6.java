public class Exception6 {
    public static void main(String[] args) {
       try {
          String str1 = "Hello World!";
          System.out.println(str1.charAt(15));
       } catch (StringIndexOutOfBoundsException e) {
          System.out.println("Exception: " + e);
       }
    }
  }

