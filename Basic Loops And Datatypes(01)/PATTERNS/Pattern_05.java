package PATTERNS;
import java.util.*;
public class Pattern_05 {
    /*
    
            Pattern - 05
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
    int st = n;
    int sp = 0;

    while(rw <= n){
        //  Printing Space..
        int ctsp = 1;
        while(ctsp <= sp){
            System.out.print("  ");
            ctsp++;
        }

        // Printing Stars .....
        int ctst = 1;
        while(ctst <= st){
            System.out.print("* ");
            ctst++;
        }

        // Preparation for NextRow.....
        rw++;
        st--;
        sp++;
        System.out.println();
    }
    }
}
