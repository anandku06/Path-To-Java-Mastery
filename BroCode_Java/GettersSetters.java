public class GettersSetters {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS -> methods that make a field READABLE
        // SETTERS -> methods that make a field WRITEABLE

        Car car = new Car("M4 Competition", "Matte Black");

        car.setColor("Chrome Red");

        System.out.println(car.getColor() + " " + car.getModel());
        // using the GETTER method to get the private vars from the class
    }
}
