import java.util.*;

// LeetCode - 17
public class Letter_Combination_of_a_Phone_Number {

    static String [] keys = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Number Input
        String num = sc.next();
        PrintKeypad(num,"");
    }
    public static void PrintKeypad(String num, String ans){
        if(num.length() == 0){
            System.out.println(ans);
            return;
        }
        int ind = num.charAt(0)-48;        // To convert numerical character into Integer...
        String pressString = keys[ind];     // Getting String of Particular index...
        for(int i = 0 ; i < pressString.length() ; i++){
            PrintKeypad(num.substring(1), ans + pressString.charAt(i));
        }

    }
}
