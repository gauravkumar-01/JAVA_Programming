import java.util.*;
public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int [] arr1 = {3,5,7,9,11};
        int [] arr2 = {1,2,4,6,7};
        int [] ans = Merge_Array(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }    
    public static int [] Merge_Array(int [] arr1, int [] arr2){
        int i = 0;
        int j = 0;
        int ind = 0;

        int len1 = arr1.length;
        int len2 = arr2.length;
        int [] ans = new int[len1+len2];
        
        while(i < len1 && j < len2){
            if(arr1[i] < arr2[j]){
                ans[ind] = arr1[i];
                i++;
            }
            else{
                ans[ind] = arr2[j];
                j++;
            }
            ind++;
        }
        while(i < len1){
            ans[ind] = arr1[i];
            i++;
            ind++;
        }
        while(j < len2){
            ans[ind] = arr2[j];
            j++;
            ind++;
        }
        return ans;
    }
}
