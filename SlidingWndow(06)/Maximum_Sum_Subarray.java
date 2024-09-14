public class Maximum_Sum_Subarray {
    // Find the maximum sum of subarray of size k
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int k = 3;
        int [] arr ={1,2,7,5,11,3,2,1};

        System.out.println(Maximum_Sum(k,arr));
    }

    public static int Maximum_Sum(int k, int [] arr){
        int sum = 0;
        int mx = 0;
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        mx = sum;
        for(int i = k ; i < arr.length ; i++){
            sum += arr[i];          // Window Grow...
            sum -= arr[i-k];        // Window Shrink...
            mx = Math.max(sum,mx);     // Answer Update...
        }
        return mx;
    }
}
