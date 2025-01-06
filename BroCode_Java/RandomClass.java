
import java.util.Random;

/* Random number generation in Java using Random Class ; 
    To use the Random class just like Scanner class make its instance and use its properties and methods */ 

public class RandomClass {
    public static void main(String[] args){
        Random random = new Random();

        int num = random.nextInt(6); // generates random number upto 6 (exclusive)
        // if not given any args : it generates number that is very large between the range of the 'int' datatype
        // to avoid this, give the terminating range.

        double num1 = random.nextDouble(); // generates random number between 0 and 1

        boolean isHeads = random.nextBoolean(); // generates true or false randomly

        System.out.println(num);
        System.out.println(num1);
        System.out.println(isHeads);
    }
}
