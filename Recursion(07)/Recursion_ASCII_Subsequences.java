import java.util.*;
//from CB
public class Recursion_ASCII_Subsequences {
    /* ASCII Subsequences of ab
        ""
        "b"
        "98"
        "a"
        "ab"
        "a98"
        "97"
        "97b"
        "9798"

        // Here, we will have three choices..
            1-> Do not add the character
            2-> Add the Character
            3-> Add the character in ASCII

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Total_Count : " + ASCII_Subsequences(str,""));
    }
    public static int ASCII_Subsequences(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return 1;
        }

        char ch = str.charAt(0);
        int a = ASCII_Subsequences(str.substring(1), ans);
        int b = ASCII_Subsequences(str.substring(1), ans+ch);
        int c = ASCII_Subsequences(str.substring(1), ans+(int)ch);
        return a+b+c;
    }
}
