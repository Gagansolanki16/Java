import java.util.Scanner;
class array {
    public static void main(String[] args) {
        int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month number: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Days in January: " + arr[0]);
                break;
            case 2:
                System.out.println("Days in February: " + arr[1]);
                break;
            case 3:
                System.out.println("Days in March: " + arr[2]);
                break;
            case 4:
                System.out.println("Days in April: " + arr[3]);
                break;
            case 5:
                System.out.println("Days in May: " + arr[4]);
                break;
            case 6:
                System.out.println("Days in June: " + arr[5]);
                break;
            case 7:
                System.out.println("Days in July: " + arr[6]);
                break;
            case 8:
                System.out.println("Days in August: " + arr[7]);
                break;
            case 9:
                System.out.println("Days in September: " + arr[8]);
                break;
            case 10:
                System.out.println("Days in October: " + arr[9]);
                break;
            case 11:
                System.out.println("Days in November: " + arr[10]);
                break;
            case 12:
                System.out.println("Days in December: " + arr[11]);
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
