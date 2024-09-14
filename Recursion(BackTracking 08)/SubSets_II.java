import java.util.*;
public class SubSets_II  {
    // LeetCode - 90
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        List<Integer> sl = new ArrayList<>();
        List<List<Integer>> dl = new ArrayList<>();
        Arrays.sort(arr);
        Subsets(arr,sl,dl,0);
        System.out.println(dl);
    }
    public static void Subsets(int [] arr, List<Integer> sl, List<List<Integer>> dl, int ind){
        if(ind == arr.length){
            dl.add(new ArrayList<>(sl));
            return;
        }
        for(int i = ind ; i < arr.length ; i++){
            
            // Accept
            if(i > ind && arr[i] == arr[i-1]){
                continue;
            }
            // Reject
            Subsets(arr,sl,dl,ind+1);
            sl.add(arr[i]);
            Subsets(arr, sl, dl, i+1);
            sl.remove(sl.size()-1);
        }
    }
}
