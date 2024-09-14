public class Maximum_Subarray_Kadenes_Algorithm {
    public static void main(String [] args){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Kadens_Algorithm(arr);
        System.out.println(maxSum);
    }

    public static int Kadens_Algorithm(int [] arr){
        int ans = Integer.MIN_VALUE;
        int pre_sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            pre_sum += arr[i];
            ans = Math.max(ans,pre_sum);
            if(pre_sum < 0){
                pre_sum = 0;
            }
        }
        return ans;
    }
}