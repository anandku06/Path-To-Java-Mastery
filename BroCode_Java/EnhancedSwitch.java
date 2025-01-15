import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced Switches => a replacement to many if-else statements
        // takes a condition and matches the value of the condition with the cases provided and executes that case if matched

        String day;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day -> ");
        day = sc.nextLine();

        // new Syntax : use arrow sign(->) ; no use of break keyword
        
        switch(day){
            case "Monday" -> System.out.println("It's a working day(┬┬﹏┬┬)");

            case "Tuesday" -> System.out.println("It's a working day(┬┬﹏┬┬)");

            case "Wednesday" -> System.out.println("It's a working day(┬┬﹏┬┬)");

            case "Thursday" -> System.out.println("It's a working day(┬┬﹏┬┬)");
            
            case "Friday" -> System.out.println("It's a working day(┬┬﹏┬┬)");

            case "Saturday" ->System.out.println("It's a Holiday^_^");

            case "Sunday" ->System.out.println("It's a Holiday^_^");

            default -> System.out.printf("%s is not a day!!");
        }

        // more clear and concise

        switch(day){
            case
        }

        sc.close();
    }
}
