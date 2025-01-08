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

        double price1 = 9.99;
        double price2 = 19000000.99;
        double price3 = -29.99;

        System.out.printf("\n%f\n%f\n%f", price1, price2, price3); // without precision specified, the numbers will take 6 places after decimal
        System.out.printf("\n%.2f\n%.2f\n%.2f", price1, price2, price3); // here specified the precision that after decimal we want only two decimal places

        // [flags]

        /* 
         * + => output a plus
         * , => comma grouping seperator
         * ( => negative numbers are enclosed in ()
         * 'space' => display a minus if negative, space if positive
         */

         System.out.printf("\n%+.2f", price1); // displayed '+' sign before the number
         System.out.printf("\n%,.2f", price2); // seperates the digits in thousands order
         System.out.printf("\n%(.2f", price3); // negative number is enclosed in braces
         System.out.printf("\n% .2f", price3); // space if positive, else the negative sign is there

    }
}
