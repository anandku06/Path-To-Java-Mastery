public class OverloadedContructors{
    public static void main(String[] args) {
        // overloaded contructors -> allow a class to have multiple constuctors, with different parameters lists, Enable objects to be initialised in various ways.

        // making a object of class User

        User user1 = new User("ayyush08"); // given params bcz the constructor of User class is called

        System.out.println(user1.userName);
        System.out.println(user1.email);

        User user2 = new User("keshu1408", "1408keshugtxrtx@gmail.com");
        // here the second constructor is called due to the params

        System.out.println(user2.userName);
        System.out.println(user2.email);

    }
}