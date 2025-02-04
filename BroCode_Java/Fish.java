public class Fish extends Animal{
    
    @Override // using this to signify that this method is overridden
    // also provides a check that this method can't be spelled wrong
    // if it happens then it throws an error, telling that this method is not being overridden
    void move(){
        System.out.println("This animal is swimming!!");
    }
}
