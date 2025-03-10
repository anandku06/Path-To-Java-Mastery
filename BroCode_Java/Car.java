import java.util.Date;

public class Car implements Vehicle{
    // Class attributes -> properties of the class
    private String model, color; // made these properties private to limit thier modification
    private final String make; // made this private and used 'final' keyword to limit its modification
    int year = 2000;
    double price = 59999.99;
    boolean isRunning = true;
    Engine engine;

    // here not using static keyword because we are instantiating the class ; we are making the objects of the class

    Car(String model, int yr, String engineType){
        this.make = null;
        this.model = model;
        this.year = yr;
        this.engine = new Engine(engineType);
    }
    // made a constructor that dynamically creates a engine object and engineType args is passed to it
    // here composition take place : The class Car requires another class as its part i.e. Engine that provides the engine type of Car's object when initialised

    Car(){
        this.model = null;
        this.make = null;
        this.color = null;
        this.year = new Date().getYear();
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
        this.make = "Unknown"; // default value for make
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
        this.engine.start();
        System.out.println("Your " + this.model + " is running!!");
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

    // GETTER methods -> using this method to get the private properties of the class
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getMake(){
        return this.make;
    }

    //SETTER methods -> using this method to modify the private data members

    void setColor(String color){
        this.color = color;
    }

    void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
    // so that the object made can be accessed using the println function

    @Override
    public void go(){
        System.out.println("You drive the car!!");
    }
}
