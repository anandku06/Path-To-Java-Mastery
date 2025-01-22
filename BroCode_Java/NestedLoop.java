import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        // nested loop -> a loop inside another loop ; used often with matrices and DSA

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        } // nested loop

        Scanner sc = new Scanner(System.in);

        int rows, columns;
        char symbol;

        System.out.print("Enter the number of rows -> ");
        rows = sc.nextInt();

        System.out.print("Enter the number of columns -> ");
        columns = sc.nextInt();

        System.out.print("Enter the symbol -> ");
        symbol = sc.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
