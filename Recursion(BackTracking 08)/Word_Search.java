import java.util.*;
public class Word_Search {
    // LeetCode - 79
    public static void main(String[] args) {
        String word = "ABCCED";
        char [][] board = {
                        {'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}
                    };
        boolean found = false;
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    found = Find_Word(board,i,j,word);
                    if(found){
                        System.out.println("Word Found");
                        return;
                    }
                }
            }
        }
        System.out.println("Not Found");
    }
    public static boolean Find_Word(char [][] board,int cr, int cc, String word){
        if(word.length() == 0){
            return true;
        }
        if(cr < 0 || cr >= board.length || cc < 0 || cc >= board[0].length || word.charAt(0) != board[cr][cc]){
            return false;
        }
        boolean ans = false;
        char ch = board[cr][cc];
        board[cr][cc] = '@';
        ans = Find_Word(board,cr,cc+1,word.substring(1)) || Find_Word(board,cr-1,cc,word.substring(1)) || Find_Word(board,cr,cc-1,word.substring(1)) || Find_Word(board,cr+1,cc,word.substring(1));
        board[cr][cc] = ch;
        return ans;
    }
}
