import java.util.NoSuchElementException;
import java.util.Vector;
public class Exception11 {
    public static void main(String[] args) {
       try {
          Vector<Integer> v = new Vector<>();
          v.elements().nextElement();
       } catch (NoSuchElementException e) {
          System.out.println("Exception: " + e);
       }
    }
  }
