public class Rotate_Array_02 {

    // Using Reversal Algorithm
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;

        k = k%arr.length;
        Reverse(arr.length-k,arr.length-1,arr);     // Reversing last 'k' elements..
        Reverse(0,arr.length-k-1, arr);     // Reversing the starting to kth element..
        Reverse(0, arr.length-1,arr);       // Reversing the entire Array..

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Reverse(int i, int j, int [] arr){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    
}
