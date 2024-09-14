package PATTERNS;
import java.util.*;
public class Pattern_01 {
    /*  
        Pattern - 01
            n=5
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
     */

     public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;     // Row.
        int st = n;     // Number of star in the row.

        while(rw <= n){
            // STAR PRINTING...
            int ct = 1;     // Count of Star..
            while(ct <= st){
                System.out.print("* ");
                ct++;
            }
            // PREPERATION FOR NEXT ROW..
            rw = rw+1;
            System.out.println();
        }
     }
}
