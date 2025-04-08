import java.util.Scanner;
class type {
    public static void main(String[] args) {
        System.out.println("Enter a integer number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        byte b;
        b = (byte) i;
        System.out.println("int to byte: " + b);

        System.out.println("Enter a double number: ");
        double d = sc.nextDouble();
        int a = (int) d;
        System.out.println("Double to int: " + a);

        byte b1 = (byte) d;
        System.out.println("Double to byte: " + b1);
    }
}

