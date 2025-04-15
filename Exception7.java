import java.io.FileNotFoundException;
import java.io.FileReader;
public class Exception7 {
    public static void main(String[] args) {
       try {
          FileReader f1 = new FileReader("demo.txt");
       } catch (FileNotFoundException e) {
          System.out.println("Exception: " + e);
       }
    }
  } 

