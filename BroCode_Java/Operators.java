// Operators in Java

public class Operators {
    public static void main(String[] args){
        // <---------- Arithmetic Operators ------------>

        int x = 10;
        int y = 3;
        int z;

        // z = x + y; // Addition
        // z = x - y; // Subtraction
        // z = x * y; // Multiplication
        // z = x / y; // Division
        z = x % y; // Modulus Operator : returns the remainder after the division

        System.out.println(z);

        // <----------- Augmented Assignment Operators -------->

        // x = x + y; // this can be also written by using augmented assignment operators
        // x += y; // its the same thing as before
        // same for other operators as well

        // x -= y; // x = x - y;
        // x *= y; // x = x * y;
        // x /= y; // x = x / y; // but here as 'x' is a 'int' datatype so the decimal part of the result is not shown
        x %= y; // x = x % y;

        System.out.println(x);

        // <----------- Increment/Decrement Operator ----------->

        x = 12;

        // x += 1; // augmented assignment operator
        // x = x + 1; // traditional method;
        x++; // Increment operator

        System.out.println(x);

        y = 123;

        // y = y - 1; // traditional method
        // y -= 1; // augmented assignment operator
        y--; // decrement operator

        System.out.println(y);

        // Order of Operations -> [P - E - M - D - A - S]
        /*
         * P -> parenthesis
         * E -> exponents
         * M -> multiplication
         * D -> division
         * A -> addition
         * S -> subtraction
         */

         double result = 3 + 4 * (7 - 5) / 2.0;

         System.out.println(result);
    }   
}
