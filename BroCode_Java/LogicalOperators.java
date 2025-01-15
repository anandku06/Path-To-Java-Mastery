public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators in Java used to check and modify more than one conditions simultaneously
        // && -> AND -> when all the conditions are true then true else false
        // || -> OR -> when any one condition is true then true
        // ! -> NOT -> if true then false and vice-versa

        double temp = 35;
        boolean isSunny = false;

        if(temp < 30 && temp >= 0 && isSunny){ 
            System.out.println("The weather is GOOD and its sunny outside!!!");
        } // here temp should be less than 30 AND greater than and equal to 0 AND isSunny should be true, then true
        else if(temp < 30 && temp >= 0 && !isSunny){
            System.out.println("Its windy outside but the weather is GOOD!!!");
        } // here the isSunny must be false, as the NOT op will turn the false to true, so the condition will be true
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad!!");
        } // here either of the condition must be true
    }
}
