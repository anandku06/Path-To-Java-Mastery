
import java.util.Scanner;

public class PracticeMath2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;

        System.out.print("Enter the radius -> ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the sphere is -> " + circumference);

        scanner.close();
    }
}
