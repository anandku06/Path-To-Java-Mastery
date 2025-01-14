public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator ? => return 1 or 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        //traditionally
        if(score < 100){
            System.out.println("Better luck next time!!!");
        }
        else{
            System.out.println("Bravo!! more to go");
        }
    }
}
