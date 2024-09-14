import java.util.*;
public class StringBuilder_Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.substring(1,3));
        System.out.println(sb.toString());
    }
}
