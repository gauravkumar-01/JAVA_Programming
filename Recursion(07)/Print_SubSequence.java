import java.util.*;
public class Print_SubSequence {
    // SubSequence -> forward moving characters, (contigious character not mandatory)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SubSequence(str,0,"");
    }
    public static void SubSequence(String str,int ind, String ans){
        if(ind == str.length()){
            System.out.println(ans + " ");
            return;
        }

        // If character is not added..
        SubSequence(str, ind+1, ans);
        // If character is added..
        SubSequence(str, ind+1, ans+str.charAt(ind));
    }
}
