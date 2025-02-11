public class Engine {
    
    String type;

    Engine(String engineType){
        this.type = engineType;
    }

    void start(){
        System.out.println("You started the " + this.type + " engine.");
    }
}
