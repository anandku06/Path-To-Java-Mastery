import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 100, bet, payout;
        String[] row;

        System.out.println("!! Welcome to Java Slots !!");
        System.out.println("Symbols : 🥚 🎈 🎁 🎉 ☘️");

        while (balance > 0) {
            System.out.println("Current balance -> $" + balance);
            System.out.print("Enter your bet amount -> $");
            bet = sc.nextInt();

            if(bet > balance){
                System.out.println("Insufficient balance!!");
                continue;
            }
            else if (bet <= 0){
                System.out.println("Bets must be greater than 0(zero)!!");
                continue;
            }
            else{
                balance -= bet;
            }

            spinRow();
        }

        sc.close();
    }

    static String[] spinRow(){

        String[] symbols = {"🥚", "🎈", "🎁", "🎉", "☘️"};
        String[] row = new String[3];
        Random rand = new Random();

        

        return new String[0];
    }
}
