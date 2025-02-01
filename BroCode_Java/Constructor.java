public class Constructor {
    public static void main(String[] args) {
        // constructor -> A special methods to initialise objects
        //                  you can pass arguments to a constructor and set up initial values

        Student stud1 = new Student("Ayush", 21, 3.2); // here bcz the constructor is defined to take args so we given the data that can be used by this object
        Student stud2 = new Student("Keshav", 22, 3.5);

        System.out.println(stud1.name);
        System.out.println(stud1.age);
        System.out.println(stud1.gpa);

        System.out.println(stud2.name);
        System.out.println(stud2.age);
        System.out.println(stud2.gpa);
    }
}
