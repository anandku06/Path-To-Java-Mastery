public class OverloadedMethods {
    public static void main(String[] args) {
        // Overloaded methods -> methods that share the same time,
        //              but different parameters signature = name 
        //              + parameters

        System.out.println(add(12, 34));
        System.out.println(add(123, 343, 435));

        String pizza = bakePizza("flatbread");

        System.out.println(pizza);
    }

    static String bakePizza(String bread){
        return bread.toUpperCase() + " pizza";
    }

    static double add(double a, double b){
        return a + b;
    }

    static int add(int a, int b){
        return a + b;
    } // can be of different datatype but having the same name

    static double add(double a, double b, double c){
        return a + b + c;
    } // same name but have different number of parameters
}
