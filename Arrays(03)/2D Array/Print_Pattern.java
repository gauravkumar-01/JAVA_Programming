import java.util.*;
public class Print_Pattern {
    /*
            INPUT : 
            1   2   3   4
            5   6   7   8
            9   10  11  12

            OUTPUT :

            1 5 9
            10 6 2
            12 8 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        int [][] arr = new int[nr][nc];

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        // Printing
        for(int col = 0 ; col < arr[0].length ; col++){
            if(col%2 == 0){
                for(int row = 0 ; row < arr.length ; row++){
                    System.out.print(arr[row][col] + " ");
                }
            }
            else{
                for(int row = arr.length-1 ; row >= 0 ; row--){
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }    
}
