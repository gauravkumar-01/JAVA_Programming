public class Swap_Array {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {10,20,30,40,50};

        System.out.println(arr1[0] + " " + arr2[0]);
        Swap(arr1,arr2);
        System.out.println(arr1[0] + " " + arr2[0]);
    }
    public static void Swap(int [] arr1, int [] arr2){
        int [] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }
    
}
