public class printfStatment {
    public static void main(String[] args) {
        // printf() => a method used to format output
        // doesn't end on newline, requires '\n' character for it
        // %[flag][width][.precision][specifier-character]

        String name = "Chaman"; // %s for strings 
        char firstLetter = 'C'; // %c for characters
        int age = 10; // %d for integers
        double height = 60.6; // and for float and double we use %f or %.f and number of digits for decimal places
        boolean isStudent = true;

        System.out.printf("Hello %s, Your name starts with %c\nYour age is %d years and height is %.1f\nAre you a student? %b", name, firstLetter, age, height, isStudent); // variable ka naam same order me dena hai jaise use aaye
    }
}
