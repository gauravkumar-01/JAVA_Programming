import java.util.*;
public class Replace_All_PI {
    // from CB
    // A string is given replace 'pi' to 3.14 in the string
    // Example :  xpix => x3.14x
    public static void main(String[] args) {
        String str = "xpipippixxpi";
        Replace_PI(str,"");
    }

    public static void Replace_PI(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        if(((str.length() >= 2) && (str.substring(0,2)).compareTo("pi") == 0)){
            Replace_PI(str.substring(2), ans+"3.14");
        }
        else{
            Replace_PI(str.substring(1), ans+str.charAt(0));
        }
    }
}
