import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-05-15");
        LocalDateTime d05 = LocalDateTime.parse("2022-05-15T10:56:23");
        Instant d06 = Instant.parse("2022-05-15T10:56:23Z");
        //Instant d07 = Instant.parse("2022-05-15T10:56:23-03:00");

        LocalDate d08 = LocalDate.parse("31/07/2024", fmt1);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        //System.out.println(d07);
        System.out.println(d08);
    }
}
