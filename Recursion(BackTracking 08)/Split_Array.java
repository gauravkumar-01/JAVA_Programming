import java.util.*;
public class Split_Array {
    // from CB
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5};
        Subsets(arr,0,0,0,"","");
    }    
    public static void Subsets(int [] arr, int ind, int sum1, int sum2, String ans1, String ans2) {
        if(ind == arr.length){
            if(sum1 == sum2){
                System.out.println(ans1 + " and " + ans2);
            }
            return;
        }
        Subsets(arr, ind+1, sum1+arr[ind], sum2, ans1+arr[ind]+" ", ans2);
        Subsets(arr, ind+1, sum1, sum2+arr[ind], ans1, ans2+arr[ind]+" ");
    }
}
