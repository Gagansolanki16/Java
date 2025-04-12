import java.util.Scanner;
class Square2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Square root of sum of integers: " + Math.sqrt(c));
    }
}

