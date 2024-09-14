package PATTERNS;
import java.util.*;
public class Pattern_02 {

    /*
            Pattern - 02
            n=5
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
        int st = 1;

        while(rw <= n){
            int ct = 1;     // Counting of Star
            while(ct <= st){
                System.out.print("* ");
                ct++;
            }

            // Preperation of next row..
            rw++;
            st++;
            System.out.println();
        }
    }
    
}
