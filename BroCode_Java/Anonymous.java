public class Anonymous {
    public static void main(String[] args) {
        // Anonymous classes -> a class that doesn't have a name, Cannot be reused
        // add custom behaviour without having to create a new class
        // often used for one time uses (TimerTask, Runnable, Callbacks)

        Dog dog = new Dog();
        TalkingDog scooby = new TalkingDog(); // if any anomaly or a unique case occurs, rather than making a new class use anonymous classes

        dog.speak();
        scooby.speak();
    }
}
