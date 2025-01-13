/* .substring() -> a method used to extract a portion of string.
 * syntax: .substring(start, end); start point of the string and end point of the string as args(exclusive)
*/

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;

        System.out.print("Enter your email -> ");
        email = sc.nextLine();
        // String userName = email.substring(0, 15);
        // String domain = email.substring(16, 24);
        String userName = email.substring(0,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1); // using .indexOf() method to get the index of the '@' character

        System.out.println(userName);
        System.out.println(domain);

        sc.close();
    }
}
