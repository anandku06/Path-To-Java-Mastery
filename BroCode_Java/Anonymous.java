public class Anonymous {
    public static void main(String[] args) {
        // Anonymous classes -> a class that doesn't have a name, Cannot be reused
        // add custom behaviour without having to create a new class
        // often used for one time uses (TimerTask, Runnable, Callbacks)

        Dog dog = new Dog();
        // TalkingDog scooby = new TalkingDog(); // if any anomaly or a unique case occurs, rather than making a new class use anonymous classes
        Dog dog1 = new Dog(){
            @Override
            void speak(){
                System.out.println("This dog is unique and talks ENGLISH!!");
            }
        }; // this is how you use anonymous class to specify any unique case or object; this is not reused

        dog.speak();
        dog1.speak();
    }
}
