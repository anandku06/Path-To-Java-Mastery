public class Triangle extends Shape{
    
    double base, height;

    Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}
