import java.util.*;
public class N_Queen_Permutation {
    // Print all the arrngements of Queens so that all queen can sit inside the box properly..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tb = sc.nextInt();      // Total Box
        boolean [] box = new boolean[tb];
        int tq = sc.nextInt();      // Total Queen
        Queen_Placed(box,tq, 0,"");
    }
    public static void Queen_Placed(boolean [] box, int tq, int qpsf, String str){
        // qpsf -> queen Places so far...
        if(qpsf == tq){
            System.out.println(str);
            return;
        }
        for(int i = 0 ; i < box.length ; i++){
            if(box[i]){     // If queen is already placed at index i..
                continue;
            }
            box[i] = true;
            Queen_Placed(box, tq, qpsf+1, str +"b"+i+"q"+qpsf + " ");
            box[i] = false;
        }
    }
}
