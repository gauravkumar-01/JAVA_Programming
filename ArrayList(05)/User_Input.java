import java.util.*;
public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = 5;
        for(int i = 0 ; i < n ; i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
    }
}
