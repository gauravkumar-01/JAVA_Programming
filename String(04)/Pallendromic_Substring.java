public class Pallendromic_Substring {
    public static void main(String[] args) {
        String str = "NAMAN";
        Print_Substring(str);  
    }

    public static void Print_Substring(String str){
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i+1 ; j <= str.length() ; j++){
                if(isPallendrome(str.substring(i, j)))
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static boolean isPallendrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    } 
}
