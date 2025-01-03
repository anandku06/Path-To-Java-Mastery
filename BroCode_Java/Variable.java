/* 
    Variable -> a re-usable container for a value;
        a variable behaves as if it was the value it contains

    Two types of variables:
    - Primitive -> simple value stored directly in memory (stack)
    - Reference -> memory address (stack) that points to the heap.

    Primitive examples -> int, double, float, char, boolean
    Reference examples -> string, array, object

    2 steps to declare any variable -
        1. declaration
        2. assignment
*/

public class Variable {
    public static void main(String[] args) {
        // an int datatype can only store int values not other datatypes

        int age = 90; // this variable is int bcz it holds a value of 'int' datatype
        char letter = 'M';
        // char letter = 2; // this is wrong as the variable is of char datatype

        float rate = 0.08f; // here to work with float dataype we use literal 'f' to signify the compiler that it is a float

        double interest = 0.11; // bcz the decimal numbers without any literals are considered as double

        System.out.println(age);
        System.out.println(letter);
        System.out.println(rate);
        System.out.println(interest);
        System.out.println("The current interest on the Loan is " + interest); // this is concatenation of strings using '+' operator
        System.out.println("The current interest on the Loan is " + "interest"); // this is concatenation of strings using '+' operator ; you can give any other string
        // note we are not adding any thing to the interest value or the sentence written its just printed together by this method
    }
}
