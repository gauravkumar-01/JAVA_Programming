package PATTERNS;
import java.util.*;
public class Pattern_09 {
    /*
        for n = 5;

                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * * 
        
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int row = 1;
        int st = 1;
        while(row <= n){
            // Printing space
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // Printing Star
            int ctst = 1;
            while(ctst <= st){
                System.out.print("* ");
                ctst++;
            }

            // Preperation for next row
            row++;
            sp--;
            st += 2;
            System.out.println();

        }
    }
}
