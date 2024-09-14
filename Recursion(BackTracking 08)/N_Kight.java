import java.util.*;
public class N_Kight {
    // from CB
    // Night will move 2.5 steps
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // Size of Board , Number of Knights
        boolean [][] board = new boolean[n][n];
        int ct = Place_Knight(board,n,0,0,"");
        System.out.println(ct);
    }
    public static int Place_Knight(boolean [][] board, int tk, int cr, int cc, String ans){
        if(tk == 0){
            System.out.println(ans);
            return 1;
        }
        if(cc == board.length){
            cr++;
            cc = 0;
        }
        if(cr == board.length){
            return 0;
        }
        int ct = 0;
        if(isPossible(cr,cc,board)){
            board[cr][cc] = true;
            ct += Place_Knight(board, tk-1, cr, cc+1, ans + "{" + cr + "-" + cc + "} ");
            board[cr][cc] = false;
        }
        // If Not Possible to place in current cell
        ct+= Place_Knight(board, tk, cr, cc+1, ans);
        return ct;
    }
    public static boolean isPossible(int cr, int cc, boolean [][] board){
        int [] r = {-1,-1,-2,-2};
        int [] c = {-2,2,-1,1};
        for(int i = 0 ; i < r.length; i++){
            if(cr+r[i] >= 0 && cc+c[i] >= 0 && cr+r[i] < board.length && cc + c[i] < board.length && board[cr+r[i]][cc+c[i]] == true){
                return false;
            }
        }
        return true;
    }
}
