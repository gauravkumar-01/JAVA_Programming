public class Sorting_Selection {
    public static void main(String[] args) {
        int [] arr = {1,3,2,7,9,4};
        
        Selection_Sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void Selection_Sort(int [] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int mini = i;       // Index of Minimum value
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[mini] > arr[j]){
                    mini = j;
                }
            }
            // Swapping...

            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
}
