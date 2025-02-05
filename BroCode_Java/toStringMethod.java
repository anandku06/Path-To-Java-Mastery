public class toStringMethod {
    public static void main(String[] args) {
        // .toString() -> method inherited from the Object class
        // used to return a string representation of an object
        // By default, it returns a hash code as a unique identifier
        // it can be overriden to provide a meaningful details

        Car car = new Car("Mustang", "Yellow", "Ford", 2010);
        Car car2 = new Car("M4_Coupe", "Matte Blue", "BMW", 2019);

        System.out.println(car); // if output directly then it shows the memory address of the car object made
        // as the toString() method is normally available to all objects, overriding it to get the details is a good practice

        System.out.println(car2);
    }
}
