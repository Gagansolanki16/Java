import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int originalNumber = number; 
        int sum = 0;  
        int remainder;

        while (number > 0) {
            remainder = number % 10; 
            sum += remainder * remainder * remainder; 
            number /= 10; 
        }

       
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
