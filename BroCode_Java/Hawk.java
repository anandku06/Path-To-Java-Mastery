public class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("The Hawk is hunting!!!");
    }
}
// here to use the Interface in the class we use the 'implements' keyword and the name of the Interface
// if the class has the Interface implemented then the abstract method of that interface must be declared in that class
