import java.util.Scanner;
class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Number multiplied by -1: " + (a * -1));
        } else
            System.out.println("Number: " + a);
    }
}
