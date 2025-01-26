import java.util.Scanner;

public class ArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] foods = {}; // this is an empty array ; can't assigned any value after assigning it
        
        System.out.print("Enter the size -> ");
        int size = sc.nextInt();


        String[] foods = new String[size]; // this is an empty array created dynamically using new keyword and values can be assigned in this array

        sc.nextLine();
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food -> ");
            foods[i] = sc.nextLine();
        }
        // looping through the empty array and on each iteration taking the input and storing it in the array

        for(String food : foods){
            System.out.println(food);
        }

        sc.close();
    }
}
