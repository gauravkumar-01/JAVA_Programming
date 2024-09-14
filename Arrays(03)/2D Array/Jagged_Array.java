import java.util.*;
public class Jagged_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();          // Number of rows
        int [][] arr = new int[nr][];
        for(int i = 0 ; i < nr ; i++){
            int nc = sc.nextInt();      // Number of Columns.
            arr[i] = new int[nc];
        }

        // Printing Array
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
