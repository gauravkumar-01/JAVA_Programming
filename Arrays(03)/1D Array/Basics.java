public class Basics {
    
    public static void main(String[] args) {
        int [] arr = null;  // declaration of array. We have to initailize the array before using it.
                            // Bydefault Address is null.
        System.out.println(arr);

        int [] arr1 = new int[5];   // It will create array of 5 integer blocks in 'HEAP MEMORY'. Each block having bydefault value is 0.
        // Arrays has 0 based indexing.

        // Accessing value by indexing..
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        // System.out.println(arr1[5]);        // for 5 elements, index sre(0 to 4). So for index 5 it will give 'ArrayIndexOutOfBound' Exception.
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // Printing by loop

        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i] + 100);
        }
    }
    
}
