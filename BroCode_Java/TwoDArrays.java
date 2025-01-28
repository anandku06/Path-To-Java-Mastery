public class TwoDArrays {
    public static void main(String[] args) {
        // 2D arrays -> an array where each element is an array
        //              useful for storing a matrix of data

        String[][] groceries = {
            {"Apple", "Banana", "Cherry"}, 
            {"Tomato", "Potato", "Onion"}, 
            {"chicken", "pork", "beef", "fish"}
        }; // this is an 2D array as each element is itself is an array
        // to access the elements of this array, we need nested loop

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        } // first looping through the outer array and then each element's array by the inner loop
    }
}
