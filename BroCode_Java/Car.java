public class Car {
    // Class attributes -> properties of the class
    String make = "Ford";
    String model = "Mustang";
    int year = 2000;
    double price = 59999.99;
    boolean isRunning = true;

    // here not using static keyword because we are instantiating the class ; we are making the objects of the class

    // class methods
    void start(){
        isRunning = true;
        System.out.println("You started the engine!!");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine!!");
    }

    void drive(){
        System.out.println("You drive the " + this.model + "!!");
    }

    void brake(){
        System.out.println("You brake the " + this.model + "!!");
    }
}
