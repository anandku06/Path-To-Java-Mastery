import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        // Number guessing game

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int guess, attempts = 0, randomNumber;
        randomNumber = rand.nextInt(1,11);

        System.out.println("Number Guessing Game!!");
        System.out.println("Guess a number between 1-10");

        do{
            System.out.print("Enter your guess -> ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too Low! try again!!");
            }
            else if(guess > randomNumber){
                System.out.println("Too high!! Try again!");
            }
            else{
                System.out.println("You guessed it right!!");
                System.out.printf("In %d attempts", attempts);
            }

        }while(guess != randomNumber);

        sc.close();
    }
}
