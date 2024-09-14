import java.util.*;
public class SubSets {
    // LeetCode - 78
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3};
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> dl = new ArrayList<>();
        Find_SubSet(arr,al,dl,0);
        System.out.println(dl);
    }
    public static void Find_SubSet(int [] arr,List<Integer> sl, List<List<Integer>> dl, int ind){
        if(ind == arr.length){
            dl.add(new ArrayList<>(sl));
            return;
        }
        // Reject
        Find_SubSet(arr, sl, dl, ind+1);
        // Accept
        sl.add(arr[ind]);
        Find_SubSet(arr, sl, dl, ind+1);
        sl.remove(sl.size()-1);
    }
}
