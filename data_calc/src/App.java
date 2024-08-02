import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.now();

        String pattern = "dd/MM/yyyy";
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern(pattern);

        LocalDate pastWeek = d01.minusDays(7);
        LocalDate nextWeek = d01.plusDays(7);
        LocalDate pastMonth = d01.minusMonths(1);
        LocalDate nextMonth = d01.plusMonths(1);

        Instant pastWeekV2 = d03.minus(7, ChronoUnit.DAYS);

        System.out.println("Past week date: " + pastWeek.format(fmt1));
        System.out.println("Next week date: " + nextWeek.format(fmt1));
        System.out.println("Past month: " + pastMonth.format(fmt1));
        System.out.println("Next month: " + nextMonth.format(fmt1));
        System.out.println("Past week instant: " + pastWeekV2);
        System.out.println("Nowdays: " + d01.format(fmt1));
    }
}
