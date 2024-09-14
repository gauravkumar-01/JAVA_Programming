import java.util.*;
public class Subset_Problem {
    // From CB
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        System.out.println("Total Count is : " + Solve(arr,0,tar,"",0));
    }    
    public static int Solve(int [] arr, int ind, int tar, String ans, int sum){
        if(ind == arr.length){
            if(sum == tar){
                System.out.println(ans);
                return 1;
            }
            return 0;
        }
        // If element is not added
        int a = Solve(arr, ind+1, tar, ans, sum);
        // If element is adeded
        int b = Solve(arr, ind+1, tar, ans+arr[ind] + " ", sum+arr[ind]);
        return a+b;
    }
}
