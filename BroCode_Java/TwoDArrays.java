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

        groceries[0][0] = "pineapple"; // to access or modify the elements we specify the row and columns both

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        } // first looping through the outer array and then each element's array by the inner loop

        // a keypad telephone
        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'},
        }; 

        for(char[] i : telephone){
            for(char j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
