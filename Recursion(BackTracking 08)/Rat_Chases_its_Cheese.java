import java.util.*;
public class Rat_Chases_its_Cheese {
    // Problem at CB
    /*  
        -> You are given a matrix some cell are open 'O' or some are blocked 'X'.
        -> The rat can move from its position to right, up, left, down.
        -> Consider 1 based indexing, Initially, the rat is at (1,1) and cheese at (n,m), where n -> number of rows, m -> number of columns
        -> Find the path to reach there.
     */
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        char [][] mat = {
                            {'O','X','O','O'},
                            {'O','O','O','X'},
                            {'X','O','X','O'},
                            {'X','O','O','X'},
                            {'X','X','O','O'}
                        };
        int [][] ans = new int[n][m];
        Find_Path(mat, 0, 0,ans);
        if(!isPath){
            System.out.println("PATH NOT FOUND");
        }
    }
    static boolean isPath = false;
    public static void Find_Path(char [][] mat, int cr, int cc, int [][] ans){
        if(cr < 0 || cr >= mat.length || cc < 0 || cc >= mat[0].length || mat[cr][cc] == 'X'){
            return;
        }
        if(cr == mat.length-1 && cc == mat[0].length-1){
            if(mat[cr][cc] == 'O'){
                ans[cr][cc] = 1;
                Display(ans);
                isPath = true;
                ans[cr][cc] = 0;
            }
            return;
        }

        ans[cr][cc] = 1;
        mat[cr][cc] = 'X';
        // Move Right
        Find_Path(mat, cr, cc+1, ans);
        // Move Up
        Find_Path(mat, cr-1, cc, ans);
        // Move Left
        Find_Path(mat, cr, cc-1, ans);
        // Move Down
        Find_Path(mat, cr+1, cc, ans);
        // Backtracking
        ans[cr][cc] = 0;
        mat[cr][cc] = 'O';
    }
    public static void Display(int [][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
