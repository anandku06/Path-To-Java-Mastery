import java.util.ArrayList;

public class Lists{
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

        System.out.println(list);
    }
}