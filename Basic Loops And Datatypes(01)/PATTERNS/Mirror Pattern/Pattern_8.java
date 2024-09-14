import java.util.*;
public class Pattern_8 {

    /*
        for n = 5;

    *      *
      *   *
        *
      *    *
    *        *


     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;
        int sp1 = 0;
        int sp2 = n-2;

        while(rw <= n){

            // Printing first space...
            int ctsp1 = 1;
            while(ctsp1 <= sp1){
                System.out.print("  ");
                ctsp1++;
            }

            // Printing Star
            System.out.print("* ");
            
            // Printing Second Space....
            int ctsp2 = 1;
            while(ctsp2 <= sp2){
                System.out.print("  ");
                ctsp2++;
            }

            // Printing Second Star.
            if(rw != n/2+1){
                System.out.print("* ");
            }

            // Preparation for next row..
            if(rw <= n/2){
                sp1++;
                sp2 -= 2;
            }
            else{
                sp1--;
                sp2 += 2;
            }
            rw++;
            System.out.println();
        }
     }
}
