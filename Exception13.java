class InsufficientBalance extends Exception{
    public InsufficientBalance(String message){
        super(message);
    }
}
public class Exception13 {
    public static void main(String[] args) {
        int balance = 500;
        String acno = "1647859654123695";
        String uname = "Gagan";
        try {
            if (balance < 1000){
                throw new InsufficientBalance("Balance below 1000");
            }
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
    }
}
