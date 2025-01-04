// Operators in Java

public class Operators {
    public static void main(String[] args){
        // Arithmetic Operators

        int x = 10;
        int y = 3;
        int z;

        // z = x + y; // Addition
        // z = x - y; // Subtraction
        // z = x * y; // Multiplication
        // z = x / y; // Division
        z = x % y; // Modulus Operator : returns the remainder after the division

        System.out.println(z);

        // Augmented Assignment Operators

        // x = x + y; // this can be also written by using augmented assignment operators
        // x += y; // its the same thing as before
        // same for other operators as well

        // x -= y; // x = x - y;
        // x *= y; // x = x * y;
        // x /= y; // x = x / y; // but here as 'x' is a 'int' datatype so the decimal part of the result is not shown
        x %= y; // x = x % y;

        System.out.println(x);
    }   
}
