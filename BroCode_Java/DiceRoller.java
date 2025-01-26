import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int numOfDice, total;

        System.out.print("Enter the # of dice to roll -> ");
        numOfDice = sc.nextInt();

        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = rand.nextInt(1, 7);
                System.out.println("You rolled: " + roll);
            }
        }
        else{
            System.out.println("Number of dice must be positive!!");
        }

        sc.close();
    }
}
