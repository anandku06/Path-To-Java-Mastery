public class Scope {

    static int x = 3; // here this variable has what's called Class Scope ; consider it as a global variable that is accessed by any method if called

    public static void main(String[] args) {
        // variable scope = where a variable can be accessed
        int x = 1; // here the variable 'x' is in a local scope
        // local scope is the scope in the method itself, it can't be accessed outside of that method
        // here the class scoped var is replaced by the local scoped var
        
        System.out.println(x);
        
        DoSomething();
    }
    
    static void DoSomething(){
        int x = 2; // here the scope of the variable is local for this method; no connection with the main method's 'x' var
        // here the class scoped var is replaced by the local scoped var

        System.out.println(x);
    }
}
