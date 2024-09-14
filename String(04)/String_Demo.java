import java.util.*;
public class String_Demo {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String str = "hello";
        String str2 = "hello";
        // str and str2 both will point at the same address inside String pool.
        System.out.println(str);
        System.out.println(str2);

        String str3 = new String("hello");      // This string will create outside pool but inside heap memory...
        String str4 = new String("hello");         // This string will also create outside pool and inside heap.
        // These both are different string created at different place inside heap memory..(Duplicacy can occur outside String pool).

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str.length());
        
    }
}
