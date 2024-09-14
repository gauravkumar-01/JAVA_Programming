import java.util.*;
public class Nth_Triangle {
    // from CB
    /*
     for 1st triangle : 1
     for 2nd triangle : 1+2
     for 3rd triangle : 1+2+3
     and son on...
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Find_Val(n));
    }    
    public static int Find_Val(int n){
        if(n == 1){
            return 1;
        }
        return n+Find_Val(n-1);
    }
}
