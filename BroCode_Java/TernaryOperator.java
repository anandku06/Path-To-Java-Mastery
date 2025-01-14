import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator ? => return 1 or 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score -> ");
        score = sc.nextInt();

        //traditionally
        if(score < 100){
            System.out.println("Better luck next time!!!");
        }
        else{
            System.out.println("Bravo!! more to go");
        }

        // using ternary op

        String passOrFail = (score < 100) ? "Failed! better luck next time" : "Passed!! more to go";

        System.out.println(passOrFail);

        sc.close();
    }
}
