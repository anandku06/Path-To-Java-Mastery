import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaring vars

        double weight, newWeight;
        int choice;

        // welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // prompt for user choice
        System.out.print("Choose your preference -> ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs. -> ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your weight in kgs is -> %.2f kgs", newWeight);
        }

        else if(choice == 2){
            System.out.print("Enter the weight in kgs. -> ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in lbs is -> %.2f lbs", newWeight);
        }
        else{
            System.out.println("Enter correct choice!!");
        }
        
        sc.close();
    }
}
