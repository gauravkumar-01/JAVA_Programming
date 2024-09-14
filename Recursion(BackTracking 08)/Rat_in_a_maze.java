import java.util.*;
public class Rat_in_a_maze {

    /*  Rat can move either right or down.
        It will start from cell (0,0).
        Print the path through which it can reach..
    */
    public static void main(String[] args) {
        char [][] board= {
                        {'O','X','O','O'},
                        {'O','O','O','X'},
                        {'O','O','X','O'},
                        {'X','O','O','O'},
                        {'X','X','O','O'},
                    };
        
        int [][] ans = new int[board.length][board[0].length];
        IsReach(board,0,0,ans);
        
    }
    static boolean f = false;
    public static void IsReach(char [][] board, int cr, int cc, int [][] ans){
        if(cr < 0 || cr >= board.length || cc < 0 || cc >= board[0].length || board[cr][cc] == 'X'){
            return;
        }
        if(cr == board.length-1 && cc == board[0].length-1){
            Display(ans);
            return;
        }
        board[cr][cc] = 'X';
        ans[cr][cc] = 1;
        IsReach(board, cr, cc+1, ans);
        if(f){
            return;
        }
        IsReach(board, cr+1, cc, ans);
        board[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    public static void Display(int [][] arr){
        f = true;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}