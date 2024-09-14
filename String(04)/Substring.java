import java.util.*;
public class Substring {
    public static void main(String[] args) {
        String str = "abcde";
        Print_Substring(str);  
    }

    public static void Print_Substring(String str){
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i+1 ; j <= str.length() ; j++){
                System.out.println(str.substring(i, j));
            }
        }
    }   
}