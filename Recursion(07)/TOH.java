import java.util.*;
public class TOH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print_Steps(n,"A","B","C");
    }
    public static void Print_Steps(int n, String src, String help, String des){
        if(n == 0){
            return;
        }
        // Move n-1 disks at helper with the help of destination.
        Print_Steps(n-1, src, des, help);
        System.out.println("Move " + n + "th disc from " + src + " to " + des);
        Print_Steps(n-1, help, src, des);
    }
}
