import java.util.*;
public class Pallendrome_Partitioning {
    // LeetCode - 131
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> al = new ArrayList<>();
        List<List<String>> dl = new ArrayList<>();
        Partitioning(str,al,dl);
        System.out.println(dl);
    }
    public static void Partitioning(String str, List<String> sl,List<List<String>> dl){
        if(str.length() == 0){
            dl.add(new ArrayList<String>(sl));
            return;
        }
        for(int i = 1 ; i <= str.length() ; i++){
            String sub = str.substring(0,i);
            if(isPallendrome(sub)){
                sl.add(sub);
                Partitioning(str.substring(i),sl,dl);
                sl.remove(sl.size()-1);
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
