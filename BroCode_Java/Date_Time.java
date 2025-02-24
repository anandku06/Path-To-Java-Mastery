import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time {
    public static void main(String[] args) {
        // how to work with Dates & Times using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now(); // returns the current date in local format -> yyyy-mm-dd
        LocalTime time = LocalTime.now(); // returns the current time in 24hrs format with the after seconds
        System.out.println(LocalDateTime.now()); // returns the current time and date both 

        System.out.println(date); 
        System.out.println(time); 

        Instant instant = Instant.now(); // An instantaneous point on the time-line ; in UTC format
        System.out.println(instant);
    }
}
