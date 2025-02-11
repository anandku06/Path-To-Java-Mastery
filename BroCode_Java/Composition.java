public class Composition {
    public static void main(String[] args) {
        // Composition -> represents a "part-of" relationship between objects
        // for ex : an Engine is "part of" a Car
        // allows complex objects to be constructed from smaller objects

        Car car = new Car("BMW", 2019, "V10");

        System.out.println(car.getModel());
        System.out.println(car.year);
        System.out.println(car.engine.type); // here the address of the Engine object is returned, to access the type we have to again use dot notation for the engine type as well

        car.start();
    }
}
