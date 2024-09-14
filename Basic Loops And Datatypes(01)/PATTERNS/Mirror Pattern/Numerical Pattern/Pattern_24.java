import java.util.*;
public class Pattern_24 {
    
    /*
        for n = 5;

            1
          2 2 2
        3 3 3 3 3
      4 4 4 4 4 4 4
    5 5 5 5 5 5 5 5 5

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rw = 1;
        int st = 1;
        int sp = n-1;

        while(rw <= n){
            // Printing Spaces...
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("  ");
                ctsp++;
            }

            // Printing Stars...
            int ctst = 1;
            while(ctst <= st){
                System.out.print(rw+" ");
                ctst++;
            }

            // Preparation for next row...
            rw++;
            System.out.println();
            st+=2;
            sp--;
        }
    }
}
