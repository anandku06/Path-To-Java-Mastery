public class MethodOverriding {
    public static void main(String[] args) {
        // Method Overriding -> when a subclass provides its own implementation of a method that is already defined
        // allows for code reusability and give specific implementation

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move(); // here the Animal class move method got overridden by the Fish class move method
    }
}
