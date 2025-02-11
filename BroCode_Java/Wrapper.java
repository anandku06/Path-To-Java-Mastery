public class Wrapper {
    public static void main(String[] args) {
        
        // Wrapper class -> allow primitive values(int, char, double, boolean) to be used as objects.
        // "Wrap there in an object"
        // Generally, don't wrap primitives unless you need an object
        // allow use of Collection Framework and static Utility methods

        int a = 123; 
        // It is deprecated 
        // here when using Wrapper class, it looks like this -> Integer a = new Integer(123); -> here a is now a Integer object
        // same goes for other values like
        double d = 123.45; // Double d = new Double(123.45); 
        char c = '$'; // Char c = new Char('$');
        boolean bool = true; // Boolean bool = new Boolean(true);
    }
}
