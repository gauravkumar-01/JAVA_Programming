import java.util.*;
public class Power {
    // Find a^b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = Power(a,b);
        System.out.println(ans);
    }

    public static int Power(int a, int b){
        // Base Case
        if(b == 0){
            return 1;
        }

        int fn = Power(a,b-1);      // Function Calling..
        return a*fn;
    }
}
