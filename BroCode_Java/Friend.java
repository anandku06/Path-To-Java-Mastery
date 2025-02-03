public class Friend {
    
    // data attributes
    String name;
    static int numOfFriends; // by making this static this attributes will be shared across all the objects made rather than each having thier own copy

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

}
