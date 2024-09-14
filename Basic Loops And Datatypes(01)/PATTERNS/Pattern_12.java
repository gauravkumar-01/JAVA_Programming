package PATTERNS;

import java.util.*;
public class Pattern_12 {

     /*

    for n =5;
      
            *
          * ! *
        * ! * ! *
      * ! * ! * ! *
    * ! * ! * ! * ! *

      */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rw = 1;
        int st = 1;
        int sp = n-1;

        while(rw <= n){
            // Printing Space
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // Printing Stars and space 
            int ctst = 1;
            while(ctst <= st){
                if(ctst % 2 == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
                }
                ctst++;
            }

            // Preparation for next row...

            rw++;
            st += 2;
            sp--;
            System.out.println();
        }
    }
}