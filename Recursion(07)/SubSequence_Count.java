import java.util.*;
public class SubSequence_Count {

    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SubSequence1(str,"",0);
        System.out.println("Total Count : " + count);       // By using static variable

        System.out.println("==================================");

        System.out.println("Your Count is : " + SubSequence2(str, "",0));
    }
    public static void SubSequence1(String str, String ans,int ind){
        if(ind == str.length()){
            System.out.println(ans);
            count++;
            return;
        }

        SubSequence1(str, ans, ind+1);
        SubSequence1(str, ans+str.charAt(ind), ind+1);
    }

    public static int SubSequence2(String str, String ans, int ind){
        if(ind == str.length()){
            System.out.println(ans);
            return 1;
        }

        int s1 = SubSequence2(str, ans, ind+1);
        int s2 = SubSequence2(str, ans+str.charAt(ind), ind+1);

        return s1+s2;
    }
}
