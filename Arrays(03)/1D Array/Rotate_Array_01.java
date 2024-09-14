public class Rotate_Array_01 {

    // Rotate the array 'k' times...
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        k = k%arr.length;
        Rotate(arr,k);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void Rotate(int [] arr, int k){
        while(k-- > 0){
            int item = arr[arr.length-1];
            for(int i = arr.length-1 ; i > 0 ;i-- ){
                arr[i] = arr[i-1];
            }
            arr[0] = item;
        }
    }
    
}
