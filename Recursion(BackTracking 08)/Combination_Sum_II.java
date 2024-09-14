import java.util.*;
public class Combination_Sum_II {
    // LeetCode - 40
    public static void main(String[] args) {
        int [] arr = {10,1,2,7,6,1,5};
        int tar = 8;
        Arrays.sort(arr);
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> dl = new ArrayList<>();
        Find_Combination(arr,tar,al,dl,0);
        System.out.println(dl);
    }
    public static void Find_Combination(int [] arr, int tar,List<Integer> al,List<List<Integer>> dl, int ind){
        if(tar == 0){
            dl.add(new ArrayList<>(al));
            return;
        }
        for(int i = ind; i < arr.length; i++){
            if(i != ind && arr[i] == arr[i-1]){
                continue;
            }
            if(tar - arr[i] >= 0){
                al.add(arr[i]);
                Find_Combination(arr, tar-arr[i], al,dl,i+1);
                al.remove(al.size()-1);
            }
        }
    }
}