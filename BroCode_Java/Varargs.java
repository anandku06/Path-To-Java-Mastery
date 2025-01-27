public class Varargs {
    public static void main(String[] args) {
        
        // varargs -> allow a method to accept a varying # of args
        //              makes methods more flexible, no need for overloaded methods
        //              Java will pack the arguments into an array
        //              ... (ellipsis)

        System.out.println(add(1, 2,34, 56));
    }

    static int add(int... nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        return sum;
    }
}
