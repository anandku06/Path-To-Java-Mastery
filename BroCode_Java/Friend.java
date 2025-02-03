public class Friend {
    
    // data attributes
    String name;
    static int numOfFriends; // by making this static this attributes will be shared across all the objects made rather than each having thier own copy

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends."); // not using 'this' keyword as this is a 'static' method and as it always refers to the class itself so no need
    }

}
