import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        // generics -> a concept where you can write a class, interface or method that is compatible with the different datatype
        // <T> type parameter (placeholder that gets replaced with a real type)
        // <String> type argument (specifies the type)

        // example
        ArrayList<String> fruits = new ArrayList<>(); // here generics are used <String> is the type parameter given here


        Box<String> choco = new Box<>(); // here Box class takes the type parameter, String ; can be anyother as well
        choco.setItem("KitKat");
        System.out.println(choco.getItem());

        Box<Integer> nums = new Box<>(); // here Box class takes the type parameter, Integer

        nums.setItem(234);
        System.out.println(nums.getItem());

        // using the newly made class with multiple generics, String and Integer
        Products<String, Integer> product = new Products<>(choco.getItem(), nums.getItem());

        System.out.println("The product is " + product.getItem() + " and its price is Rs."  + product.getPrice());
    }
}
