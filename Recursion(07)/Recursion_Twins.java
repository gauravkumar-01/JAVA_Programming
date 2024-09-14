import java.util.*;
public class Recursion_Twins {
    // from CB
    /*
        If any ith character of String is same as the (i-2)th character then it will form the twin.
                OR we can say that ->
        If any ith character of String is same as the (i+2)th character then it will form the twin.

        //Note : We can able to understand that string of length less or equal to 2 will not form any twins..
        AXAXA
            => It will form three twins..
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ct = Count_Twins(str);
        System.out.println("Total Twins found : " + ct);
    }
    public static int Count_Twins(String str){
        if(str.length() <= 2){
            return 0;
        }
        int ct = 0;
        if(str.charAt(0) == str.charAt(2)){
            ct++;
        }
        return ct+Count_Twins(str.substring(1));
    }
}
