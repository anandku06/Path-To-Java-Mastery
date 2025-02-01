public class Student {
    // class attributes
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // constructors are called whenever a object is made from the class
    // first the name of the class and then a set of parenthesis that can be used to give parameters in future if needed
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
        // here using 'this' keyword we assigned the variables that can be given when making objects of this class
        // here 'this' keyword is replaced by the new object we made with 'new' keyword
    }

    void study(){
        System.out.println(this.name + " is studying!!"); // here the name attribute set can be used in any other methods 
    }
}
