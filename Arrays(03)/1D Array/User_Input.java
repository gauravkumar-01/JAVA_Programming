import java.util.*;
public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];        // Array of length 'n' has been created in 'Heap Memory'.
        
        // Taking Values for array..
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Printing Values of Array..
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }    
}
