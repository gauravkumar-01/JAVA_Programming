import java.util.*;
public class SubSet {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        printSubset(arr,0,"");
    }
    public static void printSubset(int [] arr, int i, String ans){
        if(i == arr.length){
            System.out.println(ans);
            return;
        }
        // If Element is not added
        printSubset(arr, i+1, ans);
        // If element is added
        printSubset(arr, i+1, ans + arr[i]);

    }
}
