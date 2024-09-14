import java.util.*;
public class Dictionary_Order {
    // Print all the permutation strings in dictionary order that are greater than the given string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> al = new ArrayList<>();
        Find_Permutation(str,al,"");
        Collections.sort(al);
        for(int i = 0 ; i < al.size() ; i++){
            if(al.get(i).compareTo(str) > 0){
                System.out.println(al.get(i));
            }
        }
    }    
    public static void Find_Permutation(String str, ArrayList<String> al, String ans){
        if(str.length() == 0){
            al.add(ans);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            Find_Permutation(str.substring(0,i) + str.substring(i+1), al, ans + ch);
        }
    }
}
