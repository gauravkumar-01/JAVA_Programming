package PATTERNS;
import java.util.*;
public class Pattern_04 {
    /*
            PATTERN - 04
            n=5
                    *
                  * *
                * * *
              * * * *
            * * * * *

            In this pattern we have to maintain 3 variables :
                -> Row
                -> No of Stars
                -> No of Spaces
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;     // Count of row
        int sp = n-1;       // No. of spaces
        int st = 1;

        while(rw <= n){
            // For Space Printing.....
            int ctsp = 1;        // Count for space..
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // For Star Printing......
            int ctst = 1;       // Counting of star....
            while(ctst <= st){
                System.out.print("* ");
                ctst++;
            }

            // Preperation of Next row..
            st++;
            sp--;
            rw++;
            System.out.println();
        }
     }
    
}
