import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
   
        LocalDate x = LocalDate.of(2025, 2, 11);
        
        System.out.println(x);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        
        System.out.println(x.format(formatter));
    }
}
