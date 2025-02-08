public class Fish extends Animal implements Predator, Prey{
    
    @Override // using this to signify that this method is overridden
    // also provides a check that this method can't be spelled wrong
    // if it happens then it throws an error, telling that this method is not being overridden
    void move(){
        System.out.println("This animal is swimming!!");
    }

    @Override
    public void flee(){
        System.out.println("The fish is swimming away!!");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting!!");
    }

    @Override
    void speak(){
        System.out.println("Fish doesn't speak!!!");
    }
}
// implementing the multiple interfaces seperating by comma