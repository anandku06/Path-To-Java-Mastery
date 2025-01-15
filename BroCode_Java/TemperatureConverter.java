import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp, newTemp;
        String unit;

        System.out.print("Enter the current temperature -> ");
        temp = sc.nextDouble();

        System.out.print("Convert to? (°C or °F) -> ");
        unit = sc.next().toUpperCase(); // also called method chaining ; when two methods are used together

        // (condition) ? ifTrue : ifFalse;

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("Your temperature in °%s is -> %.2f°%s", unit, newTemp, unit);
        sc.close();
    }
}
