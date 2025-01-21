public class BreakAndContinue {
    public static void main(String[] args) {
        // break -> break out of a loop (STOPS)
        // continue -> skip the current iteration (SKIP)

        for(int i = 0; i < 10; i++){
            if(i == 5)
            break; // means agar i ki value 5 hogi to loop tutega
            // shorthand for writing if-else when one statement is given

            if (i == 2) {
                continue; // skips krdega iteration jb i ki value 2 hogi
            }
            System.out.println(i + " ");
        }
    }
}
