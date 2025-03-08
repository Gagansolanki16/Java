import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        
        BigInteger factorial = BigInteger.ONE;
        
        
        for (int i = 1; i <= a; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        
        System.out.println("The factorial of " + a + " is " + factorial);
        
       
        scanner.close();
    }
}
