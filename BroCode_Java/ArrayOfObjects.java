public class ArrayOfObjects {
    public static void main(String[] args) {
        // to initialise an array of a object
        // Car[] cars = new Car[3]; // just like anyother arrays

        Car[] cars = {
            new Car("BMW", "Matte Black"),
            new Car("Charger", "carbon-fibre"),
            new Car("Lamborghini", "red")
        };

        for (Car car : cars) {
            car.color = "Matte Black";
            car.drive();
        }
        // here for each 'car' in 'cars' call this
    }
}
