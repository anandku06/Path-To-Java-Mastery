
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args){
        // Calculate Area of a rectangle

        Scanner scanner = new Scanner(System.in); // 'System.in' is a standard input stream in Java; by default it represents the keyboard input; It is of type 'InputStream' and is provided by the 'java.lang' package

        double width, length, area; // here declared variables, need not to be declared again; only initialised with a value

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        area = length * width;

        System.out.println("The Area of the rectangle of length " + length + " m and width " + width + " m is: " + area + " m.");
    }
}
