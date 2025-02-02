public class User {
    // class attributes

    String userName, email;
    int age;

    // giving an default constructor
    User(){
        this.userName = "Guest";
        this.email = "Not provided!!";
        this.age = 0;
    }

    // initialising a constructor that sets the username of each User class's object made
    User(String username){
        this.userName = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    // made another constructor that sets username and email for the newly made object
    User(String username, String email){
        this.userName = username;
        this.email = email;
        this.age = 0;
    }
    // this is called overloading of constructors ; having same name but the number of params are different
}
