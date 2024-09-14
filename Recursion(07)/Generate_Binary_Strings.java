import java.util.*;
public class Generate_Binary_Strings {
    // from CB

    // Given String will contain 0,1,?
    // Generate all the possible Binary Strings using 0 or 1 at place of ?..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Generate_Binary(str,"",0);
    }
    public static void Generate_Binary(String str, String ans, int ind){
        if(ind == str.length()){
            System.out.print(ans + " ");
            return;
        }
        if(str.charAt(ind) != '?'){
            Generate_Binary(str, ans + str.charAt(ind), ind+1);
        }
        else{
            // Place 0 at place of '?'
            Generate_Binary(str, ans + '0', ind+1);
            // Place 1 at place of '?'
            Generate_Binary(str, ans + '1', ind+1);
        }
    }
}
