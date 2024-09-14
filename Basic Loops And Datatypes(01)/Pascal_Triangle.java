import java.util.*;
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rw = 0;
        int st = 0;
        while(rw < n){
            
            int stct = 0;       // work as 'r' in nCr.
            int ncr = 1;
            while(stct <= st){
                System.out.print(ncr + " ");
                ncr = ((rw-stct)*ncr)/(stct+1);
                stct++;
            }

            //Preparation of next row...
            st++;
            rw++;
            System.out.println();

        }
    }
}
