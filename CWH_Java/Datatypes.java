/* 
    DataTypes in Java are of two types:
    - Primitive Datatypes (Intrinsic)
    - Non-Primitive Datatypes (Derived)

    Primitive Datatypes:
        Java is statically typed i.e. variables must be declared before use!!
        There are 8 types of primitive datatypes in Java:
        1. byte -> Value ranges from -128 to 127 ; 
                    takes 1 byte;
                    default value is 0
        2. short -> Value ranges from -(2^16)/2 to (2^16)/2 - 1
                    takes 2 bytes
                    default value is 0
        3. int -> Value ranges from -(2^32)/2 to (2^32)/2 - 1
                    takes 4 bytes
                    default value is 0
        4. float -> Value ranges can't be judged
                    takes 4 bytes
                    default value is 0.0f
        5. long -> Value ranges from -(2^64)/2 to (2^64)/2 - 1
                    takes 8 bytes
                    default value is 0
        6. double -> Value ranges can't be judged
                    takes 8 bytes 
                    default value is 0.0d
        7. char -> Value ranges from 0 to (2^16) - 1
                    takes 2 bytes (because of unicode)
                    default value is '\u0000'
        8. boolean -> Value can be true or false
                        size depends on JVM(Java Virtual Machine)
                        default value is false
*/

public class Datatypes {
    public static void main(String[] args) {
        int num1 = 12;
        char initial = 'a';
        byte num2 = 12;
        float rate = 1.23f;
        double interest = 2.345;
        String name = "Anand";
    }
}
