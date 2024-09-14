import java.util.*;
public class Pattern_16 {

    /*
    
    for n =5;

            * * * * *
          * * * *
        * * *
      * * 
    *
      * *
        * * *
          * * * *
            * * * * *
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;
        int st = n;
        int sp = n-1;

        while(rw <= 2*n-1){
            // Printing Spaces...

            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // Printing Stars...

            int ctst = 1;
            while(ctst <= st){
                System.out.print("* ");
                ctst++;
            }

            // Preparation for next row....
            if(rw < n){
                st--;
                sp--;
            }
            else{
                st++;
                sp++;
            }
            
            rw++;
            System.out.println();
        }
     }
}
