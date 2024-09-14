import java.util.*;
public class Recursion_Codes_of_the_String {
    // from CB
    /* Number to String Conversion..
        Example : 1125
                -> aabe
                -> aay
                -> ale
                -> kbe
                -> ky
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Convert(str,"");
    }

    static String [] arr = {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public static void Convert(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String s = arr[ch-'0'];
        Convert(str.substring(1), ans + s);

        if(str.length() >= 2){
            String sub = str.substring(0,2);
            int ind = Integer.parseInt(sub);
            if(ind <= 26){
                String s2 = arr[ind];
                Convert(str.substring(2), ans+s2);
            }
        }
    }
}
