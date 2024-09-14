import java.util.*;
public class N_Queen_LeetCode {
    // LeetCode - 51
    /*
        A Queen can kill with in its row, its column, and along both diagonals..
        We have to place n queens in nXn board and they should not kill each other..
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean [][] board = new boolean[n][n];
        List<String> sl = new ArrayList<>();
        List<List<String>> dl = new ArrayList<>();
        if(n == 1){
            sl.add("Q");
            dl.add(sl);
            System.out.println(dl);
            return;
        }
        if(n == 2 || n == 3){
            System.out.println(dl);
            return;
        }
        Place_Queens(board,n,0,dl);
        System.out.println(dl);
    }

    public static void Place_Queens(boolean [][] board, int n, int cr, List<List<String>> dl){
        if(n == 0){
            dl.add(new ArrayList<>(Display(board)));
            return;
        }
        if(cr >= board.length){
            return;
        }
        for(int cc = 0 ; cc < board.length ; cc++){
            if(isPossible(cr,cc,board)){
                board[cr][cc] = true;
                Place_Queens(board, n-1, cr+1,dl);
                board[cr][cc] = false;
            }
        }
    }
    public static boolean isPossible(int cr, int cc, boolean [][] board){
        // Checking for particular column
        int r = cr;
        while(r >= 0){
            if(board[r][cc]){
                return false;
            }
            r--;
        }
        // Checking for upper-left diagonal
        r = cr;
        int c = cc;
        while(r >= 0 && c >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        // Checking for upper-right diagonal
        r = cr;
        c = cc;
        while(r >= 0 && c < board.length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static List<String> Display(boolean [][] board){
        List<String> sl = new ArrayList<>();
        for(int i = 0 ; i < board.length; i++){
            String str = "";
            for(int j = 0 ; j < board.length; j++){
                if(board[i][j]){
                    str += "Q";
                }
                else{
                    str += ".";
                }
            }
            sl.add(str);
        }
        return sl;
    }
}
