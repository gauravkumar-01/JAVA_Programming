import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        int [][] arr = new int[nr][nc];
        
        // Inputting Values in 2D Array..
        for(int i = 0; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing Values in 2D Array..
        for(int i = 0; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
