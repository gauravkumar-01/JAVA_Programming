import java.util.*;
public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        for(int i = 2 ; i < n ; i++){
            if(n%i == 0){
                fact++;
            }
        }

        if(fact >= 1){
            System.out.println("It is not Prime Number...");
        }
        else{
            System.out.println("It is Prime Number...");
        }
    }    
}
