import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal, rate, amount;
        int timeCompounded, years;
        
        System.out.print("Enter the principal amount -> ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %) -> ");
        rate = scanner.nextDouble() / 100.0;

        System.out.print("Enter the number of times compounded per year -> ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the years -> ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate / timeCompounded), (timeCompounded * years));

        System.out.printf("The amount calculated would be -> %,.2f", amount);

        scanner.close();
    }
}
