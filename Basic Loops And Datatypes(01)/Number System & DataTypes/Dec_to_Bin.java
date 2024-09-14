import java.util.*;
public class Dec_to_Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        int ans = 0;

        while(n > 0){
            int rem = n%2;
            ans = ans + rem*mul;
            mul = mul*10;
            n = n/2;
        }
        System.out.println(ans);
    }    
}
