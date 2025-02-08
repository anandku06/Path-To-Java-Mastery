public class GettersSetters {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS -> methods that make a field READABLE
        // SETTERS -> methods that make a field WRITEABLE


        // without SETTER GETTER approach
        Car car = new Car("M4 Competition", "Matte Black");

        System.out.println(car.color + " " + car.model);
    }
}
