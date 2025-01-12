
import java.util.Scanner;

/* Nested If -> if k andar if 
 * if () {
        if(){}
    }
*/

public class NestedIf {
    public static void main(String[] args) {
        boolean isStudent, isSenior;
        double price = 9.99;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a student? (true/false) -> ");
        isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.println("You'll get a student discount of 10%!!");
            price *= 0.9;
            System.out.printf("Now the price you have to pay is -> %,.2f", price);
        }
        else{
            System.out.println("You won't get any student discount :(");
        }
    }
}
