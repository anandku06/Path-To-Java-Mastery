/*
    Comparison Operator :-
    >, <, <=, >=, !=, == -> used to compare any two values and returns true/false according to the comparison 
*/
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args){
        // if-statement -> peforms a block of code if its condition is true
        // if the condition is true, then the code in the if block is executed ; if 'false', then the else block is executed
        // if there are more than one condition to check then we use 'else-if' block to handle that condition

        // note: the conditions are checked from top-bottom; i.e. if the 'if' and 'else-if' both are correct then the 'if' block will execute rather than the 'else-if' block ; keep a track of the positioning of your if-else condtions

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name -> ");
        String name = scanner.nextLine();

        if(name.isEmpty()){
            System.out.println("Please enter your name!!");
        } // a String method used to check whether the String is empty or not
        // can use '.isBlank()' -> Returns true if the string is empty or contains only white space codepoints, otherwise false.
        else{
            System.out.println("Hello " + name + "!!!");
        }



        System.out.print("Enter your age!! -> ");
        int age = scanner.nextInt();

        if(age >= 65){ // checks the condition
            System.out.println("You are an senior");
        }
        else if(age >= 18){ // if age is greater than 65 then also the 'if' block will be executed
            System.out.println("You are an adult");
        }
        else if(age <= 0){ // if the 'if' block is not executed
            System.out.println("You haven't been born yet");
        }
        else{// if the condition is false then execute this
            System.out.println("You are not an adult");
        }

        System.out.print("Are you a student (true/false) -> ");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent) {
            System.out.println("Study Hard!!");
        }
        else{
            System.out.println("First go to school!!");
        }

        
        scanner.close();
    }
}
