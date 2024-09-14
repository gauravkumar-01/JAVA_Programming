public class Basics{
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        System.out.println(arr);            // It will print the address of 2D Array.
        System.out.println(arr[1]);     // It will print the address of 1D Array of index 1 of 2d array arr.

        int [][] arr1 = new int[3][];
        System.out.println(arr1);           // Address of 2D array
        System.out.println(arr1[2]);        // null (Default address of 1D array at index 2.)
    
        int [][ ] other = arr;           // Address of arr will store in other.
        System.out.println(other);
        System.out.println(other.length);
        System.out.println(other[0].length);
    
    }
}