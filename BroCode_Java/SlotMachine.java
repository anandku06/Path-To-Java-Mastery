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
            sc.nextLine();

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

            System.out.print("Spinning...");
            row = spinRow();

            printRow(row);

            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You won $" + payout + "!!!");
                balance += payout;
            }
            else{
                System.out.println("Sorry you Lost!!");
            }

            System.out.print("Do you want to play again? (Y/N) -> ");
            String playAgain = sc.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println("!! Game Over !! Your final balance is $" + balance);

        sc.close();
    }

    static String[] spinRow(){
        String[] symbols = {"🥚", "🎈", "🎁", "🎉", "☘️"};
        String[] row = new String[3];
        Random rand = new Random();

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[rand.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));
    }

    static int getPayout(String[] row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]){
                case "🥚" -> bet * 3;
                case "🎈" -> bet * 4;
                case "🎁" -> bet * 5;
                case "🎉" -> bet * 10;
                case "☘️" -> bet * 20;

                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🥚" -> bet * 2;
                case "🎈" -> bet * 3;
                case "🎁" -> bet * 4;
                case "🎉" -> bet * 5;
                case "☘️" -> bet * 10;

                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🥚" -> bet * 2;
                case "🎈" -> bet * 3;
                case "🎁" -> bet * 4;
                case "🎉" -> bet * 5;
                case "☘️" -> bet * 10;

                default -> 0;
            };
        }

        return 0;
    }
}
