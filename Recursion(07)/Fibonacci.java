import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nth_Fib(n);
        System.out.println(ans);
    }
    public static int nth_Fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = nth_Fib(n-1);
        int f2 = nth_Fib(n-2);

        return f1+f2;
    }
}
