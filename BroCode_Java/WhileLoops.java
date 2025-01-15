import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // While loop -> repeat some code forever while the condition remains true

        Scanner sc = new Scanner(System.in);

        String name = "";

        if(name.isEmpty()){
            System.out.print("Your name -> ");
            name = sc.nextLine();
        } // what if the user doesn't type a thing, then it'll print the blank

        // to avoid this use while loop
        while(name.isEmpty()){
            System.out.print("Your name -> ");
            name = sc.nextLine();
        } // while the condition(name.isEmpty()) is true, run the enclosed code, untill it becomes false

        System.out.printf("Hello %s\n", name);

        // one problem is infinte loop -> when the condition is always true

        // while (true) {} // here the condition is always true, so the loop won't end

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game!!");
            System.out.println("Press Q to exit!!");
            response = sc.next().toUpperCase();
        }
        System.out.println("You escaped!!");

        // variation in While loop called do-while loop
        // do first then check while condition
        // that is the code is to be executed once no matter what

        int age;

        System.out.print("Your age -> ");
        age = sc.nextInt();
        
        do{
            System.out.println("Your age can't be negative");
            System.out.print("Your age ->");
            age = sc.nextInt();
        }while(age < 0);
        sc.close();
    }
}
