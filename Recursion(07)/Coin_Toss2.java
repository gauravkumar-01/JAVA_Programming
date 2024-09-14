import java.util.*;
public class Coin_Toss2 {

    // Print the outcomes which does not has two consecutive Heads..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CoinToss(n,""));
    }
    public static int CoinToss(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return 1;
        }

        int head = 0;
        int tail = 0;
        if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H'){
            head = CoinToss(n-1, ans+"H");
        }
        tail = CoinToss(n-1, ans+"T");

        return head+tail;
    }
}
