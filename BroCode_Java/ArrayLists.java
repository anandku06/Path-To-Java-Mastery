import java.util.ArrayList;

public class ArrayLists{
    public static void main(String[] args){
        // ArrayList -> A resizable array that stores objects (autoboxing)
        // Arrays are fixed in size, but ArrayLists can change

        // syntax: ArrayList<WrapperClass> nameOfList = new ArrayList<>();
        // <> is diamond operator
        ArrayList<Integer> list  = new ArrayList<>(); // makes an arraylist of intergers
        list.add(45); // add method used to add the elements to the list
        list.add(12);
        list.add(23);
        list.add(456);

        ArrayList<Double> list2  = new ArrayList<>(); 
        list2.add(4.56); 
        list2.add(12.34);
        list2.add(23.34);
        list2.add(456.45);

        ArrayList<String> foods  = new ArrayList<>(); 
        foods.add("apple"); 
        foods.add("banana");
        foods.add("strawberry");
        foods.add("cherry");

        System.out.println(list); // prints the whole array
        System.out.println(list2); 
        System.out.println(foods); 
    }
}