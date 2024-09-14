package PATTERNS;
import java.util.*;
public class Pattern_03 {
    /*
            Pattern - 03
            n=5
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
        int st = n;     // No of stars....

        while(rw <= n){
            int ct = 1;     // Count of stars..
            while(ct <= st){
                System.out.print("* ");
                ct++;
            }

            // Preperation of Next row..
            rw++;
            st--;
            System.out.println();
        }
    }
}
