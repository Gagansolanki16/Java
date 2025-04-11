public class Exception1 {
    public static void main(String[] args) {
       try {
           System.out.println(10/0);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
   }
   
   