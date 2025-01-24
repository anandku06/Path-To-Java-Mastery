import java.util.Scanner;

public class Banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("Banking Program!!");
            System.out.println("******************");
            System.out.println("1. Show Balance -> ");
            System.out.println("2. Deposit -> ");
            System.out.println("3. Withdraw -> ");
            System.out.println("4. Exit -> ");
            System.out.println("******************");
    
            System.out.print("Enter your choice (1-4) -> ");
            choice = sc.nextInt();
    
            switch(choice){
                case 1 -> showBalance(balance);
                
                case 2 -> balance += deposit();
    
                // case 3 -> withdraw();
    
                case 4 -> isRunning = false;
    
                default -> System.out.println("Invalid choice!!");
            }
        }
    }

    static void showBalance(double balance){
        System.out.printf("$ %.2f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.print("Enter your amount -> ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative!!");
            return 0;
        }
        else{
            return amount;
        }
    }
}
