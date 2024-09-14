import java.util.*;
public class Maximum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =   {-2,1,-3,4,-1,2,1,-5,4};
        int ans = MaxSum(arr);
        System.out.println(ans);
    }
    public static int MaxSum(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
