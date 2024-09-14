import java.util.*;
public class Power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(Power2(num)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean Power2(int num){
        int l = 0;
        int h = num;
        while(l <= h){
            int mid = (l+h)/2;
            int pow = (int)Math.pow(2,mid);
            if(pow == num){
                return true;
            }
            else if(pow > num){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return false;
    }
}
