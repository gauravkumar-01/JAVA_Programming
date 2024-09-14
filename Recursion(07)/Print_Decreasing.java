import java.util.*;
public class Print_Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Print(n);
    }
    public static void Print(int n){
        // Base Case
        if(n == 0){
            return;
        }

        System.out.print(n + " ");      // Printing Answer

        // Function Calling
        Print(n-1);
    }
}
