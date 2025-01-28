public class TwoDArrays {
    public static void main(String[] args) {
        // 2D arrays -> an array where each element is an array
        //              useful for storing a matrix of data

        String[] fruits = {"Apple", "Banana", "Cherry"};
        String[] veggies = {"Tomato", "Potato", "Onion"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, veggies, meats}; // this is an 2D array as each element is itself is an array
        // to access the elements of this array, we need nested loop

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food);
            }
        } // first looping through the outer array and then each element's array by the inner loop
    }
}
