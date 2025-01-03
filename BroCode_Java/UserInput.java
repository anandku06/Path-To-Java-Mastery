
import java.util.Scanner;

/* 
    To take user input in Java, we require a object called 'Scanner' object. To use this object we import a package 'Scanner' from 'java.util' package
*/


public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // made a instance of Scanner class using 'new' keyword

        System.out.print("Enter your name: ");
        String name = scanner.next(); // used to take the input until any white space is encountered
        // String name = scanner.nextLine(); // takes input from the user until newline is encountered
        
        System.out.println("Hello " + name);
        scanner.close(); // closing working of the scanner object to avoid any unexpected behaviour
    }
}
