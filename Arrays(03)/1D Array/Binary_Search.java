import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {2,5,8,9,12,14,15,16,17};
        int item = 12;
        int ind = Search(arr,item);
        System.out.println(ind);
    }

    public static int Search(int [] arr, int item){
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == item)
                return mid;
            else if(arr[mid] > item)
                hi = mid-1;
            else
                lo = mid+1;
        }
        return -1;
    }
}
