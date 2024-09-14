import java.util.*;
public class Pattern_13 {

    /*
        for n = 5;

        *
        * *
        * * *
        * * * *
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
        int st =1;
        while(rw <= 2*n-1){
            // Printing Stars..
            int ctst = 1;
            while(ctst <= st){
                System.out.print("* ");
                ctst++;
            }

            // Preparation for next row

            // Mirroring Concept.....
            
            if(rw < n){
                st++;
            }
            else{
                st--;
            }
            System.out.println();
            rw++;
        }
    }
    
}
