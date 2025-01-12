/* Nested If -> if k andar if 
 * if () {
        if(){}
    }
*/

public class NestedIf {
    public static void main(String[] args) {
        boolean isStudent = true, isSenior;
        double price = 9.99;

        if(isStudent){
            System.out.println("You'll get a student discount!!");
            price *= 0.9;
        }
        else{
            System.out.println("You'll not get student discount :(");
        }
    }
}
