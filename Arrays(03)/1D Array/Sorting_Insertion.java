public class Sorting_Insertion {
    public static void main(String[] args) {
        int [] arr = {8,9,4,2,1,11,89};

        Insertion_Sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Insertion_Sort(int [] arr){

        for(int i = 1 ; i < arr.length ; i++){
            int val = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            j++;
            arr[j] = val;
        }
    }
    
}
