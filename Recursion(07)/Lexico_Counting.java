import java.util.*;
public class Lexico_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintLex(n,0);
    }
    public static void PrintLex(int n, int curr){
        if(curr > n){
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for(; i <= 9 ; i++){
            PrintLex(n,curr*10+i);
        }
    }
}
