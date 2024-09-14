import java.util.*;
public class Pattern_26 {

    /*
        for n = 5;
    
                    1
                1   2   3
            1   2   3   4   5
        1   2   3   4   5   6   7
    1   2   3   4   5   6   7   8   9

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;
        int st = 1;
        int sp = n-1;

        while(rw <= n){
            // Printng Space 
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // Printing Stars...

            int val = 1;
            int ctst = 1;
            while(ctst <= st){
                System.out.print(val + " ");
                val++;
                ctst++;
            }

            // Preparation of next row...
            rw++;
            sp--;
            st += 2;
            System.out.println();
        }
    }
}
