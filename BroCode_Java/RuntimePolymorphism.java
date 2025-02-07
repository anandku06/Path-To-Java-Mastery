import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism -> when the method that gest executed is defined at runtime based on the actual type of the pbject

        Animal animal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Would you like to have cat or dog? (1 = dog : 2 = cat) -> ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

        sc.close();
    }
}
