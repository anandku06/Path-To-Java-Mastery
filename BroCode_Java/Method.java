public class Method {
    public static void main(String[] args) {
        // method -> a block of reusable code that is executed when called () ; defined outside of the Main method
        happyBirthday(); // any number of times this function can be called
    }

    static void happyBirthday(){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");
    } // void is the return type of this method (not returning anything)
    // static used to make this method run without object reference
    // happyBirthday is the name of the method
}
