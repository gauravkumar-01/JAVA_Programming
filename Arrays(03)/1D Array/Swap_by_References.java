public class Swap_by_References {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr,0,1);
        System.out.println(arr[0] + " " + arr[1]);

    }
    public static void Swap(int [] arr , int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];      // This swap will make change in the array inside 'Heap Memory'.
        arr[ind2] = temp;
    }
    
}
