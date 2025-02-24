import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        // how to work with Dates & Times using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now(); // returns the current date in local format -> yyyy-mm-dd
        LocalTime time = LocalTime.now(); // returns the current time in 24hrs format with the after seconds
        LocalDateTime dateTime = LocalDateTime.now(); // returns the current time and date both 

        System.out.println(date); 
        System.out.println(time); 

        Instant instant = Instant.now(); // An instantaneous point on the time-line ; in UTC format
        System.out.println(instant);

        // custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss"); // Formatter for printing and parsing date-time objects.
        // the pattern provided are pre-defined in the docs
        // here MM is for months, and hh for time (hr) in 12-hr format and HH for 24-hr format
        String newDateTime = dateTime.format(formatter); // Formats this date-time using the specified formatter

        System.out.println(newDateTime);

        // specific date
        LocalDateTime specialDateTime = LocalDateTime.of(2006, 8, 15, 15, 34, 12); // Obtains an instance of LocalDateTime from year, month, day, hour, minute and second, setting the nanosecond to zero.

        System.out.println(specialDateTime);

        // comparing dates
        // isBefore() -> Checks if this date-time is before the specified date-time.
        if(specialDateTime.isBefore(dateTime)){
            System.out.println("You had born much before!!");
        }
        // isAfter() -> Checks if this date-time is after the specified date-time.
        if(specialDateTime.isAfter(dateTime)){
            System.out.println("Ye to abhi abhi hua hai!!");
        }
        // isEqual() -> Checks if this date-time is equal to the specified date-time
        if (specialDateTime.isEqual(specialDateTime)) {
            System.out.println("same dates!!");
        }
    }
}
