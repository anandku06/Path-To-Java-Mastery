public class User {
    // class attributes

    String userName, email;
    int age;

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

}
