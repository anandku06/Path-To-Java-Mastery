import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        // Enums -> (Enumerations) a special kind of class that represents a fixed set
        // of constants
        // they improve code readability and are easy to maintain
        // more efficient with the switches when comparing Strings
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day -> ");
        String res = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(res); // Converts a string to the corresponding enum constant
    
            System.out.println(day);
            System.out.println(day.getDayNumber());
    
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday!!");
    
                case SUNDAY, SATURDAY -> System.out.println("It's a weekend!!");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid Day!!");
        }
    }
}
