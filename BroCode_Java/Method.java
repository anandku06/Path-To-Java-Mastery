import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        // method -> a block of reusable code that is executed when called () ; defined outside of the Main method
        String name;
        int age;
        // using these vars in the method, pass this as arguments
        // arguments are info we send from the Main method to other made methods ; given under the set of parenthesis
        // as without sending these info can't be accessed by the methods
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name -> ");
        name = sc.nextLine();

        System.out.print("Enter your age -> ");
        age = sc.nextInt();

        if (ageCheck(age)) {
            System.out.println("You are eligible!!");
        }
        else{
            System.out.println("You are not eligible");
        }

        // happyBirthday(name, age); // arguments
        // any number of times this function can be called

        System.out.print("Enter your number -> ");
        double number = sc.nextDouble();

        System.out.println(square(number));

        System.out.println(cube(number));

        sc.close();
    }

    static void happyBirthday(String birthdayBoy, int age){ 
        // we set the original function to take some parameters
        // the number of the parameters must be same as the arguments given
        System.out.println("");
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday %s!\n!", birthdayBoy);
        System.out.printf("You are %d years old\n!", age);
        System.out.println("Happy Birthday to you!\n");
    } // void is the return type of this method (not returning anything)
    // static used to make this method run without object reference
    // happyBirthday is the name of the method

    static double square(double num){
        return num * num; // as this method returns a double so using return keyword
    }

    static double cube(double num){
        return num * num * num;
    }

    static boolean ageCheck(int age){
        if(age > 18){
            return true;
        }
        else{
            return false;
        }
    }

}
