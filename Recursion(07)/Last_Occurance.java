import java.util.*;
public class Last_Occurance {
    public static void main(String[] args) {
        int [] arr = {1,4,5,2,3,1,4,2,3,7};
        int val = 3;
        int ind = Last(arr,val,arr.length-1);
        System.out.println("Last Index : " + ind);
    }
    public static int Last(int [] arr, int val, int ind){
        if(ind < 0){
            return -1;
        }
        if(arr[ind] == val){
            return ind;
        }
        return Last(arr,val,ind-1);
    }
}
