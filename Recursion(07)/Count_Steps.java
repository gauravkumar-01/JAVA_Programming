import java.util.*;
public class Count_Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();

        // Jumps are = 1,2,3
        System.out.println("Acc to Count1 : " + Count1(tar,0));
        System.out.println("Acc to Count2 : " + Count2(tar));

        // What if we have multiple steps
        System.out.println("Acc to Count3 : " + Count3(tar,0));
    }

    public static int Count1(int tar, int curr){
        if(curr == tar){
            return 1;
        }
        if(curr > tar){
            return 0;
        }

        int a = Count1(tar, curr+1);      // 1 step
        int b = Count1(tar, curr+2);      // 2 step
        int c = Count1(tar, curr+3);      // 3 steps

        return a+b+c;
    }
    public static int Count2(int tar){
        if(tar < 0){
            return 0;
        }
        if(tar == 0){
            return 1;
        }

        int one = Count2(tar-1);
        int two = Count2(tar-2);
        int three = Count2(tar-3);

        return one+two+three;
    }

    public static int Count3(int tar, int curr){
        if(curr == tar){
            return 1;
        }
        if(curr > tar){
            return 0;
        }

        int ans = 0;
        for(int step = 1; step <= 3; step++){
            ans += Count3(tar, curr+step);
        }

        return ans;
    }
}
