import java.util.*;
public class First_Occurance {
    // Return the index of first occurance of value(if exists) otherwise return -1;
    public static void main(String[] args) {
        int [] arr = {1,4,5,2,3,1,4,2,3,7};
        int val = 3;
        int ind = First(arr,val,0);
        System.out.println("First Occurance : " + ind);
    }
    public static int First(int [] arr, int val, int ind){
        if(arr[ind] == val){
            return ind;
        }
        if(ind == arr.length){
            return -1;
        }

        return First(arr,val,ind+1);
    }
}
