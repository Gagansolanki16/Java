import java.util.Scanner;
class Calculate {
    public static void main(String[] args) {
        System.out.println("Enter 2 integer numbers: ");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Addition: " + (a1 + b1));
        System.out.println("Subtract: " + (a1 - b1));
        System.out.println("Multiply: " + (a1 * b1));
        System.out.println("Divide: " + (a1 / b1));

        System.out.println("Enter 2 float numbers: ");
        float a2 = sc.nextFloat();
        float b2 = sc.nextFloat();
        System.out.println("Addition: " + (a2 + b2));
        System.out.println("Subtract: " + (a2 - b2));
        System.out.println("Multiply: " + (a2 * b2));
        System.out.println("Divide: " + (a2 / b2));
        System.out.println("Enter 2 double numbers: ");
        double a3 = sc.nextDouble();
        double b3 = sc.nextDouble();
        System.out.println("Addition: " + (a3 + b3));
        System.out.println("Subtract: " + (a3 - b3));
        System.out.println("Multiply: " + (a3 * b3));
        System.out.println("Divide: " + (a3 / b3));
    }
}
