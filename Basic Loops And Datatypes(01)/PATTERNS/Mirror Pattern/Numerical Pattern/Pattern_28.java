import java.util.*;
public class Pattern_28 {

    /*
    
        for n =5;

            1
          2 3 2
        3 4 5 4 3
      4 5 6 7 6 5 4
    5 6 7 8 9 8 7 6 5


    IMPORTANT NOTE : Stars me Mirroring row pr lagti hai,
                    Numbers me mirroring Column pr lgti hai...
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;
        int sp = n-1;
        int st = 1;

        while(rw <= n){
            // Printing Space
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            //Printing Stars
            int ctst = 1;
            int val = rw;
            while(ctst <= st){
                System.out.print(val+" ");
                if(ctst <= st/2){
                    val++;
                }
                else{
                    val--;
                }
                ctst++;
            }

            // Preparing for next row...
            rw++;
            st += 2;
            sp--;
            System.out.println();
        }
     }
}
