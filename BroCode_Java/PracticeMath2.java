
import java.util.Scanner;

public class PracticeMath2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;

        System.out.print("Enter the radius -> ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
 
        System.out.println("The circumference of the sphere is -> " + circumference + "m");
        System.out.println("The area of the sphere is -> " + area + "m²");
        System.out.println("The volume of the sphere is -> " + volume + "m³");

        System.out.printf("The circumference, area and volume of the sphere is -> %.1fm, %.1fm², %.1f³", circumference, area, volume); // printf used to format the output of the result with limiting the decimal spaces when needed or etc.

        scanner.close();
    }
}
