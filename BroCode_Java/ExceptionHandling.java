import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Exception -> an event that interrupts the normal flow of a program (Dividing by zero, file not found, mismatch input type)
        // surround any dangerous code with a try() block
        // try{}. catch{}, finally{}

        // System.out.println(1 / 0); // this arises an division error exception due to division by zero

        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter your number -> ");
            int number = sc.nextInt();
            System.out.println(number);
        } // the code in the try block is executed
        catch(InputMismatchException e){
            System.out.println("You can't give String in place of number!!");
        } // if it catches any exception ; this input exception must be imported before use
        catch(Exception e){
            System.out.println("Something went wrong!!!");
        } // when no exceptions matches the error


        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide the number by ZERO!!");
        }

        
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.print("Enter your choice -> ");
            String choice = sc1.nextLine();
            System.out.println(choice);
        } catch (Exception e) {
            System.out.println("Something went wrong!!");
        }
        // this is try_resources block : trying the resource Scanner and if it throws an error catch block will execute

        finally{
            sc.close();
            System.out.println("This finally executes!!");
        } // optional, always execute, for clean up any resources
    }
}
