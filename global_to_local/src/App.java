import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
    public static void main(String[] args){
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println(d02.getDayOfMonth());
        System.out.println(d01.getDayOfYear());

        
    }
}
