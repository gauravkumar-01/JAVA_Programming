import java.util.*;
public class Trapping_of_Rain_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = Rain_Water(arr);
        System.out.println(ans);
    }
    public static int Rain_Water(int [] arr){
        int n = arr.length;
        int [] left = new int[n];
        int [] rgt = new int[n];
        left[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        rgt[n-1] = arr[n-1];
        for(int i = arr.length-2;i >= 0; i--){
            rgt[i] = Math.max(rgt[i+1],arr[i]);
        }

        int water = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int min = Math.min(rgt[i],left[i]);
            water += min-arr[i];
        }
        return water;
    }
}
