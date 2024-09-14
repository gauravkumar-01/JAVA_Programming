public class Sorting_Bubble {
    public static void main(String[] args) {
        int [] arr = {1,3,2,7,9,4};
        
        Bubble_Sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void Bubble_Sort(int [] arr){

        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
}
