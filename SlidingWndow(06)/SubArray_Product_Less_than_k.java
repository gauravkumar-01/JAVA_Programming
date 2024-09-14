import java.util.*;
// LeetCode - 713
// Number of contigious subarray having product strictly less than k..
public class SubArray_Product_Less_than_k {
    public static void main(String[] args) {
        int [] arr = {10,5,2,6};
        int k = 100;
        int ans = Count_Subarray(arr,k);
        System.out.println(ans);
    }
    public static int Count_Subarray(int [] arr, int k){
        int ct = 0;
        int si = 0;
        int ei = 0;
        int p = 1;
        while(ei < arr.length){

            // Wndow Grows
            p *= arr[ei];

            // Window Shrinks
            while(si <= ei && p >= k){
                p /= arr[si];
                si++;
            }

            // Answer Calculate
            ct += ei-si+1;
            ei++;
        }
        return ct;
    }
}
