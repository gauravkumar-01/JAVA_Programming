public class Reverse_Range {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        int i = 2;
        int j = 5;

        Reverse(arr,i,j);

        for(int ind = 0 ; ind < arr.length ; ind++){
            System.out.print(arr[ind] + " ");
        }
    }

    public static void Reverse(int [] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}
