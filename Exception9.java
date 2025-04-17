public class Exception9 {
    public static void main(String[] args) {
       try {
          int arr[] = new int[5];
          arr[9] = 15;
       } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Exception: " + e);
       }
    }
  }
