package PATTERNS;
import java.util.*;
public class Pattern_06 {
    /*
            Pattern-06
            n=5
            * * * * *
                * * * *
                    * * *
                        * *
                            *
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;
        int st = n;
        int sp = 0;

        while(rw <= n){
            // Printing space.....
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // Printing Stars..
            int ctst = 1;
            while(ctst <= st){
                System.out.print("* ");
                ctst++;
            }

            // Preperation of next row...
            rw++;
            st--;
            sp += 2;
            System.out.println();
        }
     }
    
}
