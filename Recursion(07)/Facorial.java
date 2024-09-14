import java.util.*;
public class Facorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
    public static int Fact(int n){
        // Base Case
        if(n <= 1){
            return 1;
        }

        // Function Calling
        int fn = Fact(n-1);

        // Calculating/ Returning answer
        return n*fn;
    }
}
