public class Interface {
    public static void main(String[] args) {
        // interface -> a blueprint for a class that specifies a set of abstract methods that implementing classes MUST define
        // Supports multiple inheritance-like behaviour

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();
    }
}
