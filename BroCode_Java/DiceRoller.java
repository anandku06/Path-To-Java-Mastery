import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int numOfDice, total = 0;

        System.out.print("Enter the # of dice to roll -> ");
        numOfDice = sc.nextInt();

        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = rand.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);

                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("Number of dice must be positive!!");
        }

        sc.close();
    }

    static void printDie(int roll){
        // for multi-line strings use Triple quotes(""" """)

        String dice1 = """
                -------
                |     |
                |  ●  |
                |     |
                -------
                """;

        String dice2 = """
                -------
                |●    |
                |     |
                |    ●|
                -------
                """;
                
        String dice3 = """
                -------
                |●    |
                |  ●  |
                |    ●|
                -------
                """;

        String dice4 = """
                -------
                |●   ●|
                |     |
                |●   ●|
                -------
                """;

        String dice5 = """
                -------
                |●   ●|
                |  ●  |
                |●   ●|
                -------
                """;
        String dice6 = """
                -------
                |●   ●|
                |●   ●|
                |●   ●|
                -------
                """;
        
        switch(roll){
            case 1 -> System.out.println(dice1);

            case 2 -> System.out.println(dice2);

            case 3 -> System.out.println(dice3);

            case 4 -> System.out.println(dice4);

            case 5 -> System.out.println(dice5);

            case 6 -> System.out.println(dice6);

            default -> System.out.println("Dice galat hai");
        }
    }
}
