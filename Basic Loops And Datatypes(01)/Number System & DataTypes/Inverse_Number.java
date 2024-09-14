import java.util.*;
public class Inverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 1;
        int ans = 0;
        while(n > 0){
            int rem = n%10;
            ans = (int)(ans + pos*Math.pow(10,rem-1));
            pos++;
            n /= 10;
        }
        System.out.println(ans);
    }    
}
