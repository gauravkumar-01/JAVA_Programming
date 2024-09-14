import java.util.*;
public class Permutation_Duplicate_Characters {
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
            boolean flag = true;        // This is done so that duplicate permutation does not generate..
            for(int j = i+1; j < str.length() ; j++){
                if(str.charAt(j) == ch){        // Checking the presence of character
                    flag = false;
                    break;
                }
            }

            // if flag true --> means no alternatve character is present..
            if(flag){
                Permutation(str.substring(0,i) + str.substring(i+1), ans + ch);
            }
        }
    }
}
