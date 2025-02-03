public class Person {
    String fName, lName;

    Person(String first, String last){
        this.fName = first;
        this.lName = last;
    }

    void showName(){
        System.out.println(this.fName + " " + this.lName);
    }
}
