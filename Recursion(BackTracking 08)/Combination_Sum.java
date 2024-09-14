import java.util.*;
public class Combination_Sum {
    // LeetCode - 39 
    public static void main(String[] args) {
        int [] arr = {2,3,5,6};
        int tar = 10;
        System.out.println(Comb_sum(arr,tar));
    }

    public static List<List<Integer>> Comb_sum(int [] arr, int tar){
        List<Integer> sl = new ArrayList<>();
        List<List<Integer>> dl = new ArrayList<>();

        Finding_Sum(arr,tar,sl,dl,0);
        return dl;
    }

    public static void Finding_Sum(int [] arr, int tar, List<Integer> sl , List<List<Integer>> dl, int ind){
        if(tar == 0){
            dl.add(new ArrayList<>(sl));
            return;
        }
        for(int i = ind ; i < arr.length ; i++){
            if(tar >= arr[i]){
                sl.add(arr[i]);
                Finding_Sum(arr, tar-arr[i], sl, dl,i);
                sl.remove(sl.size()-1);
            }
        }
    }
}