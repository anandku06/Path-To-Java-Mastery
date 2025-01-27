public class ArrayIII {
    public static void main(String[] args) {

        // Linear Search
        int[] numbers = {1, 2, 3, 4, 5};

        int target = 2;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                System.out.println("found it at index " + i + " !!");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found!!");
        }
    }
}
