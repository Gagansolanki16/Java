public class Exception5 {
  public static void main(String[] args) {
     try {
        String str1 = null;
        System.out.println(str1.length());
     } catch (NullPointerException e) {
        System.out.println("Exception: " + e);
     }
  }
}
