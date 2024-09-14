import java.util.*;
public class Pattern_25 {

    /*
     for n = 5;

                    1
                2   3   4
            5   6   7   8   9
        10  11  12  13  14  15  16
    17  18  19  20  21  22  23  24  25

    NOTE : Space in between is given by 'TAB'...
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 1;
        int st = 1;
        int sp = n-1;

        int val = 1;

        while(rw <= n){
            // Printing Space 
            int ctsp = 1;
            while(ctsp <= sp){
                System.out.print("\t");
                ctsp++;
            }

            // Printing Stars
            int ctst = 1;
            while(ctst <= st){
                System.out.print(val + "\t");
                val++;
                ctst++;
            }

            // Preparation for next row...

            rw++;
            sp--;
            st+=2;
            System.out.println();
        }
     }
}
