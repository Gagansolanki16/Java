import java.util.Scanner;
public class negative {
    public static void main(String[] args) {
        int c = 0,n;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n<0){
                c += 1;
            }
        }
        System.out.println("Number of negative numbers: " + c);
    }
}

