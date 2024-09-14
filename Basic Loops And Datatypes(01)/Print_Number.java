import java.util.*;
public class Print_Number {
    // It will print the number until the sum becomes negative....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = sc.nextInt();
            sum += n;
            if(sum < 0){
                break;
            }
            System.out.println(n);
        }    
    }    
}
