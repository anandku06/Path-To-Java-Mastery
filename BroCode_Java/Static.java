public class Static {
    public static void main(String[] args) {
        // static -> makes a variable or method belong to the class
        //              rather than to any specific object
        //  commonly used for utility methods or shared resources

       Friend frnd1 = new Friend("Ayush");
       Friend frnd2 = new Friend("Keshuji");
       
       System.out.println(frnd1.name);
       System.out.println(frnd1.numOfFriends);
       // bcz each object has its own copy of attributes, so in place of 2 it displays 1

       System.out.println(frnd2.numOfFriends);
       // after making this attribute static, now it'll count all the occurences and is shared among all the objects made
       // as this static attributes are of class, so it should be accessed by the class not the objects

       System.out.println(Friend.numOfFriends); // this is the correct way to access static members of a class

       Friend.showFriends(); // static methods with same rules

       System.out.println(Math.round(12.875)); // here as well round is a static method thats why it can be accessed with class name Math
    }
}
