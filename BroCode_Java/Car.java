public class Car {
    // Class attributes -> properties of the class
    String make, model, color;
    int year = 2000;
    double price = 59999.99;
    boolean isRunning = true;

    // here not using static keyword because we are instantiating the class ; we are making the objects of the class

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, String make, int year){
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }
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
        System.out.println("You drive the " + this.color + " " + this.model + "!!");
    }

    void brake(){
        System.out.println("You brake the " + this.model + "!!");
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
    // so that the object made can be accessed using the println function
}
