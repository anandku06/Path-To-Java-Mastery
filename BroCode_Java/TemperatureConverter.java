import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp, newTemp;
        String unit;

        System.out.print("Enter the current temperature -> ");
        temp = sc.nextDouble();

        System.out.print("Convert to? (C or F) -> ");
        unit = sc.next().toUpperCase(); // also called method chaining ; when two methods are used together
        
        sc.close();
    }
}
