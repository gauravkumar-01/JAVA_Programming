import java.util.*;
public class String_Demo2 {
    public static void main(String[] args) {
        String str = "hello";           // Inside Pool
        String str2 = "hello";          // Inside Pool
        System.out.println(str == str2);            // It compares the address..
        System.out.println(str.equals(str2));           // It compares the content..

        String str3 = new String("Hey");        // Inside heap, outside pool...
        String str4 = new String("Hey");        // Inside Heap, outside pool...
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = "hell"+"o";
        String str6 = new String("hello");
        System.out.println(str2 == str5);
        System.out.println(str5 == str6);
    }    
}
