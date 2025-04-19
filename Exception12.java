public class Exception12 {
    public static void main(String[] args) {
       try {
         Class.forName("Myclass");
       } catch (ClassNotFoundException e) {
          System.out.println("Exception: " + e);
       }
    }
  }
