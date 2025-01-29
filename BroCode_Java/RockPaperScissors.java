import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        String[] choices = {
            "rock",
            "paper",
            "scissors"
        };
        String playerChoice, compChoice, playAgain = "yes";

        do{
            System.out.print("Choose!! (rock, paper, scissors) -> ");
            playerChoice = sc.nextLine().toLowerCase();
    
            if(!playerChoice.equals("rock") && !playerChoice.equals("scissors") && !playerChoice.equals("paper")){
                System.out.println("Invalid choice!!");
                continue;
            }
    
            compChoice = choices[rand.nextInt(0,3)];
            System.out.println("Computer choice: " + compChoice);
    
            if(playerChoice.equals(compChoice)){
                System.out.println("It's a tie!!");
            }
    
            else if((playerChoice.equals("rock") && compChoice.equals("scissors")) || (playerChoice.equals("paper") && compChoice.equals("rock")) || (playerChoice.equals("scissors") && compChoice.equals("paper"))){
                System.out.println("You Win!!!");
            }
    
            else{
                System.out.println("You Lose!!");
            }
    
            System.out.print("Play again? (yes/no) -> ");
            playAgain = sc.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for Playing!!!");

        sc.close();
    }
}
