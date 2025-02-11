import javax.swing.text.html.HTMLDocument.BlockElement;

public class Wrapper {
    public static void main(String[] args) {
        
        // Wrapper class -> allow primitive values(int, char, double, boolean) to be used as objects.
        // "Wrap there in an object"
        // Generally, don't wrap primitives unless you need an object
        // allow use of Collection Framework and static Utility methods

        // here when using Wrapper class, it looks like this -> Integer a = new Integer(123); -> here a is now a Integer object
        // It is deprecated 
        // same goes for other values like Boolean, Double, Character

        // Autoboxing -> directly assigning the values to the objects without using the new keyword
        Integer a = 123; 
        Double d = 123.45; 
        Character c = '$';
        Boolean bool = true;
        String name = "Anand";

        // Unboxing ->  taking the boxed object and assigning it to its primitive value
        int x = a; // now the Integer object 'a' is unboxed and its value stored in x

        // converting other datatypes to String by using the .toString() method
        String i = Integer.toString(123);
        String j = Double.toString(123.45);
        String k = Character.toString('#');
        String l = Boolean.toString(true);

        String q = i + j + k + l; // string concatenation

        System.out.println(q);

        // converting String to other datatypes
        a = Integer.parseInt("354"); // using the .parseInt() method to convert the string to int
        d = Double.parseDouble("3.14");
        bool = Boolean.parseBoolean("true");

        c = "Pizza".charAt(0); // using the indexAt() method for char aas they haven't got any parse methods

        System.out.println(Character.isLetter(c)); // returns whether the specified element is a character or not
        System.out.println(Character.isUpperCase(c)); // returns whether the specified element is in uppercase or not
    }
}
