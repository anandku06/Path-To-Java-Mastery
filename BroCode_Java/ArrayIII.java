import java.util.Scanner;

public class ArrayIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Linear Search
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"Apple", "Orange", "Banana", "Grapes"};
        boolean isFound = false;

        System.out.print("Enter the fruit you are searching for -> ");
        String target2 = sc.nextLine();
        int target = 2;

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target2)){
                System.out.println("found it at index " + i + " !!");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found!!");
        }

        sc.close();
    }
}

// fruits[i] == target won't work as Strings are reference datatype and here we'll compare the memory locations of the two strings rather than the value
// to compare the values use Strings.equals() method!!
