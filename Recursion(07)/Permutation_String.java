import java.util.*;
// Permutation -> Possible ways of arrangement
public class Permutation_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Permutation(str,"");
    }
    public static void Permutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            Permutation(str.substring(0,i) + str.substring(i+1), ans + ch);
        }
    }
}
