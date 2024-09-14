public class Swap_by_Values {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50};
        int [] other = arr1;        // This arr will also pint to arr1.
        
        
        // Both will point the same Array in the Heap Memory..
        System.out.println(arr1);
        System.out.println(other);

        System.out.print("Before Swapping :");
        System.out.println(arr1[0] + " " + arr1[1]);
        Swap(arr1[0],arr1[1]);
        System.out.print("After Swapping :");
        System.out.println(arr1[0] + " " + arr1[1]);
        // Swapping does not occurs, bcoz only values were passed, to swap the values in the array, we have to pass the reference...
        
    }
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
