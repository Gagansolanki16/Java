import java.io.IOException;
public class Exception10 {
    public static void main(String[] args) {
       try {
          throw new IOException("Input Output Exception");
       } catch (IOException e) {
          System.out.println("Exception: " + e);
       }
    }
  }


