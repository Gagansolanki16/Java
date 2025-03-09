import java.util.Scanner;

public class Power{
    
    public static int power(int a, int b) {
        int result = a;
        
        
        for (int i = 1; i < b; i++) {
            result = result * a;
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        
        int result = power(a, b);
        System.out.println("Result: " + result);
    }
}
