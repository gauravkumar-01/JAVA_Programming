import java.util.*;
public class loop_demo {
    public static void main(String[] args) {
        // for(byte b = 0 ; b <= 128 ; b++){
        //     System.out.println(b);
        // }       // It will stuck in infinite loop, becoz range of byte is : (-128 to 127)
    
        byte a = 8;
        byte b = 127;
        byte c = (byte)(a+b);       // If we not use typecasting of a+b then number will overflow and through  an error....
        System.out.println(c);
    
        for(int i = 0; i < 5 ; i++){
            System.out.println("Hello");
        }

        for(int i = 0; i < 5 ; i++){
            System.out.println(i);
        }

        int num = 5;
        int j = 0;
        while(j <= num){
            System.out.println("Hiii");
            j++;
        }
    
    }
}
