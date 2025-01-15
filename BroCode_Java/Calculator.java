import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0.0;
        char operator;
        boolean validOperation = true;

        System.out.print("Enter your first number -> ");
        num1 = sc.nextDouble();
        
        System.out.print("Enter the operation (+, -, *, /, ^) -> ");
        operator = sc.next().charAt(0); // as the next() accepts only string so, method chaining the charAt() will return the char at the first index

        System.out.print("Enter your second number -> ");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;

            case '*' -> result = num1 * num2;

            case '-' -> result = num1 - num2;

            case '/' -> {
                if(num2 == 0){
                    System.out.println("Zero division not allowed!!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            } // if multiple lines then use braces

            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Enter a valid operation!!");
                validOperation = false;
            } 
        }

        if (validOperation) { // if the operation is valid then only print result
            System.out.println(result);
        }

        sc.close();
    }
}
