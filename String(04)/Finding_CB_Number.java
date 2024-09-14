import java.util.*;

//2,3,5,7,11,13,17,19,23,29 are CB Number.
// Any number not divisible by these numbers also a CB Number.

// RULE :
// Once CB Number detected then it should not be part of another CB Number.
public class Finding_CB_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Print_Substring(str));
    }

    public static int Print_Substring(String str){
        int ct = 0;
        boolean [] visited = new boolean[str.length()];
        for(int len = 1 ; len <= str.length() ; len++){
            for(int si = 0 ; si <= str.length() - len; si++){
                int ei = si+len;
                String s = str.substring(si,ei);
                // System.out.println(s);
                // Integer.parseInt(s);         String to Integer...

                // Long.parseLong(s);           String to Long.....

                if(isCB_Number(Long.parseLong(s))  &&  isVisited(visited,si,ei-1) == false){
                    for(int i = si; i <= ei-1 ; i++){
                        visited[i] = true;
                    }
                    ct++;
                }
                
            }
        }
        return ct;
    }

    public static boolean isCB_Number(long num){
        int [] arr = {2,3,5,7,11,13,17,19,23,29};
        // Point 1
        if(num == 0 || num == 1){
            return false;
        }

        // Point 2
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == num){
                return true;
            }
        }

        // Point 3
        for(int i = 0 ; i < arr.length ; i++){
            if(num % arr[i] == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isVisited(boolean [] arr, int si, int ei){
        for(int i = si ; i <= ei ; i++){
            if(arr[i]){
                return true;           // Already a part of CB Number, now it will not contribute...
            }
        }
        return false;        // Not visited till now, so It will contribute to CB Number..
    }

}
