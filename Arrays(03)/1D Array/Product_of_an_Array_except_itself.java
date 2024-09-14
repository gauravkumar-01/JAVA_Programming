import java.util.*;
public class Product_of_an_Array_except_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,5,7,4};
        int [] ans = Product(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int [] Product(int [] arr){
        int [] left = new int[arr.length];
        int [] rgt = new int[arr.length];
        left[0] = 1;
        for(int i =1 ; i < arr.length ; i++){
            left[i] = left[i-1]*arr[i-1];
        }
        rgt[rgt.length-1] = 1;
        for(int i = rgt.length-2; i >= 0 ; i--){
            rgt[i] = rgt[i+1]*arr[i+1];
        }
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = left[i]*rgt[i];
        }
        return arr;

    }
}
