import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators in Java used to check and modify more than one conditions simultaneously
        // && -> AND -> when all the conditions are true then true else false
        // || -> OR -> when any one condition is true then true
        // ! -> NOT -> if true then false and vice-versa

        double temp = 35;
        boolean isSunny = false;

        if(temp < 30 && temp >= 0 && isSunny){ 
            System.out.println("The weather is GOOD and its sunny outside!!!");
        } // here temp should be less than 30 AND greater than and equal to 0 AND isSunny should be true, then true
        else if(temp < 30 && temp >= 0 && !isSunny){
            System.out.println("Its windy outside but the weather is GOOD!!!");
        } // here the isSunny must be false, as the NOT op will turn the false to true, so the condition will be true
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad!!");
        } // here either of the condition must be true

        // validating a userName
        Scanner sc = new Scanner(System.in);

        // username must be between 4-12 chars
        // must not contain spaces or underscores

        String userName;

        System.out.print("Enter your username -> ");
        userName = sc.nextLine();

        if (userName.length() < 4 || userName.length() > 12) {
            System.out.println("Username must be of 4-12 characters long!!");
        }
        else if(userName.contains(" ") || userName.contains("_")){
            System.out.println("Username mustn't contain any spaces and underscores!!");
        }
        else{
            System.out.println("Welcome!!");
        }

        sc.close();
    }
}
