public class Count_Digits {
    public static void main(String[] args) {
        int n = 1234567;
        System.out.println(Count(n));
    }
    public static int Count(int n){
        int ct = 0;
        while(n > 0){
            ct++;
            n /= 10;
        }
        return ct;
    }
    
}
