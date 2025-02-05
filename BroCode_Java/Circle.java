public class Circle extends Shape{
    
    double radius;

    Circle(double r){
        this.radius = r;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
    // this abstract method must be implemented in the child classes
}
