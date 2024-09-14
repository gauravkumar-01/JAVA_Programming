import java.util.*;
public class Letter_Tile_Possibilities {
    // LeetCode - 1079
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Calling");
        System.out.println(Possibilities(str));
        System.out.println("Finished");
    }
    public static int Possibilities(String str){
        if(str.length() == 0){
            return 1;
        }
        int ct = 0;
        System.out.println("In Recursion");
        for(int i = 0 ; i <= str.length() ; i++){
            if(i > 0 && str.charAt(i) == str.charAt(i-1)){
                continue;
            }
            ct += Possibilities(str.substring(i));
        }
        return ct;
    }
}
