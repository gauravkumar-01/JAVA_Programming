package PATTERNS;


import java.util.*;
public class Pattern_10 {
    /*
        for n = 5;

        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int st = 9;
        int sp = 0;

        while(row <= n){
            // Print space
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // Printing Stars
            int ctst = 1;
            while(ctst <= st){
                System.out.print("* ");
                ctst++;
            }

            // Preparation for next row..
            row++;
            st -= 2;
            sp++;

            System.out.println();
        }
     }
    
}
