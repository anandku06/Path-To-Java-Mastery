/* .substring() -> a method used to extract a portion of string.
 * syntax: .substring(start, end); start point of the string and end point of the string as args(exclusive)
*/

public class Substring {
    public static void main(String[] args) {
        String email = "keshujichusenge@loda.arc";
        String userName = email.substring(0, 15);
        // String domain = email.substring(16, 24);
        String domain = email.substring(16); // upto the ending index

        System.out.println(userName);
        System.out.println(domain);
    }
}
