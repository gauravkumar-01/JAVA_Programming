import java.util.*;
public class Combination_Sum_III {
    // LeetCode 216
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int tar = sc.nextInt();
        int [] arr = new int[9];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i+1;
        }
        ArrayList<Integer> sl = new ArrayList<>();
        ArrayList<ArrayList<Integer>> dl = new ArrayList<>();

        Find_Outcomes(k,tar,arr,sl,dl,0);
        System.out.println(dl);
    }
    public static void Find_Outcomes(int k, int tar, int [] arr, ArrayList<Integer> sl, ArrayList<ArrayList<Integer>> dl, int ind){
        if(k == 0){
            if(tar == 0){
                dl.add(new ArrayList<>(sl));
            }
            return;
        }
        for(int i = ind; i < arr.length ;i++){
            sl.add(arr[i]);
            Find_Outcomes(k-1, tar-arr[i], arr, sl, dl,i+1);
            sl.remove(sl.size()-1);
        }
    }
}
