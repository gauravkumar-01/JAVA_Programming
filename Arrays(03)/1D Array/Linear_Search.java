import java.util.*;
public class Linear_Search {
    // Find the index of the element if present else print -1..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();

        System.out.println(Search(arr, find));
    }
    public static int Search(int [] arr, int item){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }
}
