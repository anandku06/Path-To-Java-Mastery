
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
        System.out.print(", your age: ");
        int age = scanner.nextInt(); // used to take integer inputs only from the user; if other datatypes are entered then throws error
        System.out.print("and your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // used to take boolean values as input from the user

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age + " years");
        System.out.println("Your CGPA is " + cgpa);

        if(isStudent){
            System.out.println("You can apply for scholarship");
        }
        else{
            System.out.println("You can't apply for any scholarship");
        }

        /* Common issue : When mixing next() and nextLine(), you might encounter issues because next() leaves the newline character in the input buffer, which nextLine() reads as an empty string */

        System.out.print("School: ");
        String school = scanner.next();
        scanner.nextLine(); // this will take the nextline as its input so it will not disturb the further input statements

        System.out.print("Your casual name: ");
        String cName = scanner.nextLine();

        System.out.println("Your Casual name in " + school + " is " + cName); // this will take name as the newline character
        scanner.close(); // closing working of the scanner object to avoid any unexpected behaviour
    }
}