public class Student extends Person{
    // class attributes
    // String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // constructors are called whenever a object is made from the class
    // first the name of the class and then a set of parenthesis that can be used to give parameters in future if needed
    Student(String first, String last, double gpa){
        super(first, last); // super keyword here referenced the parent class constructor and took the params that the parent class constructor needed
        // this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
        // here using 'this' keyword we assigned the variables that can be given when making objects of this class
        // here 'this' keyword is replaced by the new object we made with 'new' keyword
    }

    void study(){
        System.out.println(this.fName + " is studying!!"); // here the name attribute set can be used in any other methods 
    }
}
// here Student class inherits from Person class and Person class has its own construcotr