/* Variables are containers that stores a value. This value can be changed during the execution of the program.
    Syntax:
    datatype variableName = value; // '=' is called assignment operator. assigns value to any variable

    Rules for declaring a Java variable:
    - must not begin with a digit 
    - names are case-sensitive
    - should not be a keyword of Java
    - white spaces not allowed
    - can contain alphabets or any specila characters
*/


public class Variables {
    public static void main(String[] args) {
        int data = 231; // 'data' variable is declared with value assigned to it
        // int void; // not allowed as it is a keyword
        // int two num; // this also not allowed, white spaces between variable names
        // int 2num; // not allowed

        System.out.println(data);
    }
}

/* Datatype */