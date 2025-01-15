import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.print("Enter your first number -> ");
        num1 = sc.nextDouble();
        
        System.out.print("Enter the operation (+, -, *, /, ^) -> ");
        operator = sc.next().charAt(0); // as the next() accepts only string so, method chaining the charAt() will return the char at the first index

        System.out.print("Enter your first number -> ");
        num1 = sc.nextDouble();

        sc.close();
    }
}
