public class Dog extends Animal{
    // now the Dog class has all the properties of Animal class

    int lives = 1;
    boolean isAlive = true;

    @Override
    void speak(){
        System.out.println("The dog goes *woof*!!");
    }

    void eat(){
        System.out.println("This animal is eating!!");
    }
}
