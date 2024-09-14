public class ArmString_Number {
    // If sum of the (individual digits of any number)^(No. of digits) is become equal to the number then number is said to be Armstrong.
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n){
        int cd = Count_Digits(n);
        int num = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += (int)Math.pow(rem,cd);
            n /= 10;
        }
        return sum == num;
    }
    public static int Count_Digits(int n){
        int ct = 0;
        while(n > 0){
            ct++;
            n /= 10;
        }
        return ct;
    }
    
}
