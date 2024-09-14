import java.util.*;
// Good Substring : return the maximum length of consecutive vowels.
public class Playing_with_Good_Substring {
    public static void main(String[] args) {
        String str = "abcdeiaoghikldfaeoiuabs";
        System.out.println(Good_Substring(str));
    }
    public static int Good_Substring(String str){
        int max = 0;
        int ct = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(is_Vowel(ch)){
                ct++;
            }
            else{
                max = Math.max(max,ct);
                ct = 0;
            }
        }
        max = Math.max(max,ct);
        return max;
    }
    public static boolean is_Vowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
