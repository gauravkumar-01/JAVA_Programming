import java.util.*;
public class Board_Path {
    // From CB (Print the  Path and Total Count)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // N size of board
        int m = sc.nextInt();       // M faces of Dice..
        // Print the path to reach at N and total number of Ways
        int ways = Generate_Path(n,m,"");
        System.out.println();
        System.out.println(ways);
    }
    public static int Generate_Path(int n, int m, String path){
        if(n == 0){
            System.out.print(path + " ");
            return 1;
        }
        int ct = 0;
        for(int i = 1 ; i <= m ; i++){
            if(n-i >= 0){
                ct += Generate_Path(n-i, m, path+i);
            }
        }
        return ct;
    }
}
