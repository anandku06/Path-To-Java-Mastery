public class Objects {
    public static void main(String[] args) {
        // Objects -> an entity that holds data (attributes) and can perform actions
        //              a reference datatype
        // a Class can behave as a blue-print for creating objects

        // to make an object or an instance of a class (here Car)
        Car car = new Car("Mustang", "Yellow"); // just like we do for Scanner ; using 'new' keyword make an instance of the class

        System.out.println(car); // this will give a memory address of that 'car' object

        System.out.println(car.make); // to access the attributes/properties of the class use dot notations(.)
        System.out.println(car.model);

        System.out.println(car.isRunning);
        car.isRunning = false; // the properties can be modified as well
        System.out.println(car.isRunning);

        car.start(); // methods declared inside the class can also be accessed by dot notation.
        car.stop();

        car.drive();
        car.brake();
    }
}
