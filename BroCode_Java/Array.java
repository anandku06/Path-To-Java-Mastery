import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // arrays -> a collection of values of the same datatype
        //              think of it as a variable that can store more than one value.
        //              intialise it using the sqaure brackets after the datatype and the data is enclosed in curly braces
        // can't access directly as it is a reference datatype, if accessed directly, returns the memory address of the array's first element
        // accessing of the elements in the array using 0-based indexing
        // if accessed the element not in the array or more than the size of the array, then the exception is thrown OutOfbounds

        String[] fruits = {"Apple", "Orange", "Mango"}; // this is an array 

        fruits[1] = "Banana"; // by specifying any index, elements can be changed
        int numOfFruits = fruits.length; // returns the length of the array

        for(int i = 0; i < numOfFruits; i++){
            System.out.println(fruits[i]);
        }
        // can print all the elements of the array using loops

        Arrays.sort(fruits);
        
        // enhanced for-loop / foreach loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        // means for every fruit in fruits array -> do this(here print)
    }
}
