import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

        foods.remove("apple"); // remove method removes the specified element or the index
        foods.remove(1); 

        foods.set(0, "pineapple"); // sets the element at the specified index overwritting the previous one

        System.out.println(list); // prints the whole array
        System.out.println(list2); 
        System.out.println(foods);  
        System.out.println(list2.size()); // returns the size of the list 
        System.out.println(list2.get(2)); // gets the element at the specified index 
        Collections.sort(list); // sorts the list ; Collections contains all the necessary packages required just like C++ STL
        System.out.println(list); 

        for(int num : list){
            System.out.println(num);
        }

        Scanner sc = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();
        System.out.print("Enter the number of fruits -> ");
        int numOfFruits = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the fruits -> ");
        for(int i = 0; i < numOfFruits; i++){
            fruits.add(sc.nextLine());
        }

        System.out.println(fruits);

        sc.close();
    }
}