// Math class in Java

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI); // returns the pi's value

        System.out.println(Math.E); // returns the Euler's value

        double result = Math.pow(2, 3); // returns the power raised value of the given args ; first is the base and second is the exponent

        double res = Math.abs(-5); // returns the absolute value of the given number

        result = Math.sqrt(64); // returns the square root of the given number ; returns double value

        result = Math.round(3.14); // rounds the number to thier nearest integer value

        res = Math.ceil(3.14); // returns the smallest value ranging from the number given to the infinity

        res = Math.floor(3.14); // returns the largest value ranging from the -infinity to the number given 

        int maxi = Math.max(20, 50); // returns the maximum value between the two given numbers

        int mini = Math.min(20, 50); // returns the minimun value between the two given numbers

        System.out.println(result);
        System.out.println(res);
        System.out.println(maxi);
        System.out.println(mini);
    }
}
