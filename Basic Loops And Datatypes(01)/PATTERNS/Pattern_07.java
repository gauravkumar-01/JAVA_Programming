package PATTERNS;
import java.util.*;
public class Pattern_07 {
    /*
            Pattern - 07
            n=5
            * * * * *
            *       *
            *       *
            *       *
            * * * * *
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;
        int st = n;
        int sp = 0;

        while(rw <= n){

            if(rw == 1 || rw == n){
                int ctst = 1;
                while(ctst <= st){
                    System.out.print("* ");
                    ctst++;
                }
            }
            else{
                System.out.print("* ");
                int spct = 1;
                while(spct <= n-2){
                    System.out.print("  ");
                    spct++;
                }
                System.out.print("* ");
            }

            // Preperation for Next row...
            rw++;
            System.out.println();
        }
     }
}
