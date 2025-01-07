
import java.util.Scanner;

public class PracticeMath1 {
    public static void main(String[] args) {
        // Hypotenuse of the triangle

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter the first side of the triangle -> ");
        a = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle -> ");
        b = scanner.nextDouble();

        c = Math.hypot(a, b); // either this
        double c1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // or this both are correct

        System.out.println("The hypotenuse of the triangle is -> " + c + " m");
        System.out.println("The hypotenuse of the triangle is -> " + c1 + " m");

        scanner.close();
    }
}
