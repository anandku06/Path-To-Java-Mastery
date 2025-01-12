/*
 * String is a class that has some methods which can be accessed using dot notation and gives some useful information regarding the data
 */

public class StringMethods {
    public static void main(String[] args) {
        String name = "    Anand   ";

        int size = name.length(); // returns the length of the string
        char fLetter = name.charAt(0); // returns the character on the specified index
        int index = name.indexOf("d"); // returns the first occurence of the character specified
        int lIndex = name.lastIndexOf('n'); // returns the last index of the specified character
        name = name.toUpperCase(); // changes the string to uppercase
        name = name.toLowerCase(); // changes to lowercase
        name = name.trim(); // trims off or removes all whitespaces from the string
        name = name.replace("n", "p"); // replaces the specified letter (first args) to the given character (2nd args)

        if(name.isEmpty()){
            System.out.println("Your name is empty!!");
        }
        else{
            System.out.println("Your name is not empty!!");
        }

        if(name.contains(" ")){
            System.out.println("It contains white-spaces!!");
        }
        else{
            System.out.println("No white-spaces");
        } // returns true if the specified character is present in the string else returns false

        System.out.println(name);
        System.out.println(name.isEmpty()); // returns true if string is empty, else false

        if(name.equals("name")){
            System.out.println("They are equal!!");
        }
        else{
            System.out.println("They are not equal!!");
        } // checks whether the specified string is equal to the given string ; also case-sensitive
        // a variation regarding this property
        if(name.equalsIgnoreCase("Anand")){
            System.out.println("They are same!!!");
        }
        else{
            System.out.println("They are not same!!");
        } // same as equals() method but it is case-insensitive
    }
}
