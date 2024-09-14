public class Global_Variable {
    /*  GLOBAL VARIABLE : 
        --> The variable which is accessable by all functons.
        --> The global variable should be declared outside the function but inside the class.
        --> It is declared using 'static' keyword.
        --> Global Variable is declared in 'Heap Memory'.
    */

    static int gv = 8;      // gv is a global variable, it is accessable by all functions..

    public static void main(String[] args) {
        System.out.println("Hello");
        int x = 90;     //x is the Local variable of main function
        fun(x);
        System.out.println(gv);
        System.out.println("END");
    }
    public static void fun(int y){  // y is the local variable of fun function only..
        // System.out.println(x);  // It will give error bcoz 'x' does not has scope in this function..
        System.out.println(gv);
        System.out.println(y);
        
    }
    
}
