public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators in Java used to check and modify more than one conditions simultaneously
        // && -> AND -> when all the conditions are true then true else false
        // || -> OR -> when any one condition is true then true
        // ! -> NOT -> if true then false and vice-versa

        double temp = 20;

        if(temp < 30 && temp >= 0){ // here temp should be less than 30 AND greater than and equal to 0, then true
            System.out.println("The weather is GOOD!!!");
        }
    }
}
