public class Super {
    public static void main(String[] args) {
        // super -> refers to the parent class (subclass <- superclass)
        // used in constructores and method overriding
        // calls the parent constructorto initialise attributes

        Person p1 = new Person("Tony", "Stark");
        Student stud = new Student("Peter", "Parker", 4.0);
        Employee emp = new Employee("Chris", "Evans", 123000);

        stud.study();

        p1.showName();

        emp.showSalary();
    }
}
