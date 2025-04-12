import java.util.Scanner;

public class nozero {
    public static void main(String[] args) {
        int c = 0, n;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            
            if (n == 0) {
                break;  
            }
            
            c += 1;  
        }
        
        System.out.println("Total numbers entered (excluding zero): " + c);
    }
}
