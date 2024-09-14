import java.util.*;
public class Good_Subarrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Count_Good(arr));
    }
    public static int Count_Good(int [] arr){
        int good = 0;
        int [] rem = new int[arr.length];
        rem[0] = 1;     // Subarray of 0 elements...
        int sum = 0;
        int n = arr.length;
        for(int i = 0 ; i < arr.length;  i++){
            sum += arr[i];
            sum = sum%n;
            rem[sum]++;
        }

        // Count for Good Subarrays..(nC2);
        for(int i = 0 ; i < rem.length; i++){
            if(rem[i] >= 2){
                good += (rem[i]*(rem[i]-1))/2;
            }
        }
        return good;
    }
}
