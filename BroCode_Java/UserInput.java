
import java.util.Scanner;

/* 
    To take user input in Java, we require a object called 'Scanner' object. To use this object we import a package 'Scanner' from 'java.util' package
*/


public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // made a instance of Scanner class using 'new' keyword

        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        System.out.println("The provided input is: " + name);
        scanner.close(); // closing working of the scanner object to avoid any unexpected behaviour
    }
}
