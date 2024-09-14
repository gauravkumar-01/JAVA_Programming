public class Prime {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        int ct = 0;
        for(int i = 2 ; i < n ; i++){
            if(n%i == 0)
                ct++;
        }
        if(ct > 0)
            return false;
        else
            return true;
    }
}
