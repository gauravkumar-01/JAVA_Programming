import java.util.*;
public class Coin_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] coin = {2,3,5,6};
        int tar = 10;
        Print_Combination(coin,tar,0,"");
    }
    public static void Print_Combination(int [] arr, int tar, int ind, String ans){
        if(tar == 0){
            System.out.println(ans);
            return;
        }
        for(int i = ind; i < arr.length ; i++){
            if(tar >= arr[i]){
                Print_Combination(arr, tar-arr[i], i, ans + arr[i]);
            }
        }
    }
}
