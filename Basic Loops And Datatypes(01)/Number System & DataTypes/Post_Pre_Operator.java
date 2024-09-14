import java.util.*;
public class Post_Pre_Operator {
    public static void main(String[] args) {
        int a = 7;
        // System.out.println(a++);
        // System.out.println(a);
        // System.out.println(++a);
        // System.out.println(a);

        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);

        // b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        // Similar operations csn fone by decrement operator also...
// ==============================================================================
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

        int b = a--;
        System.out.println(a);
        System.out.println(b);

        int val = a++ + 9 -a - --a;
        System.out.println(val);
    }    
}
