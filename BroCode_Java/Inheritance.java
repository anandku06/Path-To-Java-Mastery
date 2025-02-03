public class Inheritance {
    // Inheritance -> one class inherits the attributes and methods from another class.
    // child inherits from parent
    // when inheriting the parent properties child class uses 'extends' keyword and the name of the parent class
    // child <- parent <- grandparent

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Plants plant = new Plants();

        System.out.println(dog1.isAlive);
        System.out.println(cat1.isAlive);
        
        dog1.eat();
        cat1.eat();

        System.out.println(dog1.lives);
        System.out.println(cat1.lives);

        dog1.speak();
        cat1.speak();

        plant.photosynthesis();
    }
}

// now the Animal class inherits properties from Organism class and Dog and Cat classes are child of Animal class
// this is multi-level inheritance

// A Plants class inherits its properties from Organism class and Animal class as well
// this is multiple inheritance