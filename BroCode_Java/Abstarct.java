public class Abstarct {
    public static void main(String[] args) {
        // abstract -> used to define abstract classes and methods
        // Abstraction is the process of hiding implementation details and showing only the essential feats
        // Abstract classes CAN'T be instantiated directly
        // Can contain 'abstract' methods (which must be implemented)
        // Can contain 'concrete' methods (which are inherited)

        // Shape shape = new Shape(); // here an error message is shown that this class can't be instantiated bcz of 'abstract' keyword!!

        Circle circle = new Circle(3);
        Triangle tri = new Triangle(4, 5);
        Rectangle rect = new Rectangle(45, 67);

        System.out.println(circle.area());
        System.out.println(tri.area());
        System.out.println(rect.area());
    }
}
