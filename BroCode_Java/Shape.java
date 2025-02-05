public abstract class Shape {
    
    abstract double area(); // made an abstract method, now its child must contain this method

    void display(){
        System.out.println("This is a concrete method!!");
    } // this method is concrete and this is inherited to all the classes
}
// this object can't be instantiated directly
