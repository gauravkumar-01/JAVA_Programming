import java.util.*;
public class String_Partitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Partitioning(str,"");
    }
    public static void Partitioning(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 1; i <= str.length() ; i++){
            Partitioning(str.substring(i), ans + str.substring(0,i) + "|");
        }
    }
}
