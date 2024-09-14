import java.util.*;
public class Maze_Path {
    // We have to move from starting cell to end cell of a matrix..
    // Starting cell = (0,0)
    // End Cell = (r, c)

    // Move - Horizontal (H) or Verical(V)
    public static void main(String[] args) {
        int r = 2;
        int c = 3;
        Path(r,c,0,0,"");
    }
    public static void Path(int r, int c, int cr, int cc, String ans){
        if(cr < 0 || cr > r || cc < 0 || cc > c){       // If we are at out of range
            return;
        }
        if(cr == r && cc == c){
            System.out.println(ans);
            return;
        }

        // If we move Horizontal
        Path(r,c,cr,cc+1, ans + "H ");
        // If we move vertically
        Path(r,c,cr+1,cc,ans+"V ");
    }
}
