import java.util.*;

// LeetCode 22
public class Generate_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        Parenthesis(n,0,0,"",al);

        System.out.println(al);
    }

    public static void Parenthesis(int n, int opn, int cls, String ans, ArrayList<String> al){
        if(n == opn && opn == cls){
            al.add(ans);
            return;
        }

        //For Open Paranthesis
        if(opn < n){
            Parenthesis(n, opn+1, cls, ans + "(", al);
        }
        // For Close Paranthesis
        if(opn > cls){
            Parenthesis(n, opn, cls+1, ans+")" , al);
        }
    }
}
