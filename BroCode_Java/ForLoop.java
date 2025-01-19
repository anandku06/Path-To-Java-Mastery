import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException { // if the sleep is interuptted then throws this error
        // for loop -> execute some code a certain amount of times
        // syntax:
        // for(initialisation; condition; updation){
        //     // code
        // }
        // initialisation -> a counter that tracks the number of iterations
        // condition -> a termination condition which met, then the loop ends
        // updation -> counter increases or decreases accordingly

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the termination -> ");
        int term = sc.nextInt();
        for(int i = 0; i < term; i++){
            System.out.println(i);
        }

        int start = 10;

        for(int i = start; i >= 0 ; i--){
            System.out.println(i);
            Thread.sleep(1000); // sleeps the execution for the specified ms
            // matlab har 1 sec me loop chlega
        }

        System.out.println("Happy New Year!!");
        sc.close();
    }
}
