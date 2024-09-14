import java.util.*;
public class CoinToss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ct = HeadTail(n , "");
        System.out.println("Total Outcomes are : " + ct);
    }
    public static int HeadTail(int n,String ans){
        if(n == 0){
            System.out.println(ans);
            return 1;
        }

        int head = HeadTail(n-1, ans+"H");
        int tail = HeadTail(n-1, ans+"T");

        return head+tail;
    }
}
