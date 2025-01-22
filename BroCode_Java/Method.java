public class Method {
    public static void main(String[] args) {
        // method -> a block of reusable code that is executed when called () ; defined outside of the Main method
        String name = "Anand";
        int age = 25;
        // using these vars in the method, pass this as arguments
        // arguments are info we send from the Main method to other made methods ; given under the set of parenthesis
        // as without sending these info can't be accessed by the methods


        happyBirthday(name, age); // arguments
        // any number of times this function can be called
    }

    static void happyBirthday(String name, int age){ 
        // we set the original function to take some parameters
        // the number of the parameters must be same as the arguments given
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday %s!\n!", name);
        System.out.printf("You are %d years old\n!", age);
        System.out.println("Happy Birthday to you!\n");
    } // void is the return type of this method (not returning anything)
    // static used to make this method run without object reference
    // happyBirthday is the name of the method
}
