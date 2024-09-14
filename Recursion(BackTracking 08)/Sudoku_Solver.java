import java.util.*;
public class Sudoku_Solver {
    // LeetCode - 37(Hard)
    public static void main(String[] args) {
        char [][] board = {
                            {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}
                        };

        Solve_Sudoku(board,0,0);
        Display(board);
    }

    public static boolean Solve_Sudoku(char[][] board, int cr, int cc){
        if(cc == 9){
            cr++;
            cc = 0;
        }
        if(cr == 9){
            return true;
        }
        if(board[cr][cc] != '.'){
            if(Solve_Sudoku(board, cr, cc+1)){
                return true;
            }
        }
        else{
            for(int i = 1; i <= 9 ; i++){
                char val = (char)('0'+i);
                if(isPossible(board,cr,cc,val)){
                    board[cr][cc] = val;
                    if(Solve_Sudoku(board,cr,cc+1)){
                        return true;
                    }
                    else{
                        board[cr][cc] = '.';
                    }
                }
            }
        }
        return false;
    }

    public static boolean isPossible(char [][] board,int cr, int cc,char val){
        // Checking for Row
        for(int i = 0 ; i < 9 ; i++){
            if(board[cr][i] == val){
                return false;
            }
        }
        // Checking for Column
        for(int i = 0 ; i < 9 ; i++){
            if(board[i][cc] == val){
                return false;
            }
        }
        // Checking for it's 3X3 grid
        int r = cr-cr%3;
        int c = cc-cc%3;
        
        for(int i = r ; i < r+3 ; i++){
            for(int j = c ; j < c+3 ; j++){
                if(board[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }
    public static void Display(char [][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}