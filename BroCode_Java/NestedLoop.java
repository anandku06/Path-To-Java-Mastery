public class NestedLoop {
    public static void main(String[] args) {
        // nested loop -> a loop inside another loop ; used often with matrices and DSA

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        } // nested loop
    }
}
