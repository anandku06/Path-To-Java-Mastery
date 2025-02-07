public class Polymorphism {
    public static void main(String[] args) {
        
        // polymorphism -> POLY means Many ;  MORPH means shape
        // objects can identify as other objects
        // objects can be treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] vehicles = {car, bike, boat};
        // made an array of vehicles using the 'Vehicle' as the common datatype bcz each class extends that class

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
