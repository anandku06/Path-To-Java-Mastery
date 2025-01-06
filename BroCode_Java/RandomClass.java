
import java.util.Random;

/* Random number generation in Java using Random Class ; 
    To use the Random class just like Scanner class make its instance and use its properties and methods */ 

public class RandomClass {
    public static void main(String[] args){
        Random random = new Random();

        int num = random.nextInt(1, 6); 
        // it generates number that is very large between the range of the 'int' datatype
        // to avoid this, give range as its params.

        System.out.println(num);
    }
}
