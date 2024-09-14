import java.util.*;
public class Coin_Permutation_Backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] coin = {2,3,5,6};
        int tar = 10;
        Permutation(coin,tar,"");
    }
    public static void Permutation(int [] arr, int tar, String ans){
        if(tar == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < arr.length; i++){
            if(tar >= arr[i]){
                tar -= arr[i];
                Permutation(arr, tar, ans + arr[i]);
                tar += arr[i];
            }
        }
    }
}
