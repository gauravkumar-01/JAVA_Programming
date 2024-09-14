import java.util.*;
public class N_Queen_Combination {
    // (b0q0 b1q1) and (b0q1 b1q0) --> This will be considered as same..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tb = sc.nextInt();      // Total Box
        int tq = sc.nextInt();      // Total Queen

        boolean [] box = new boolean [tb];
        Queen_Placed(box,tq,0,0,"");
    }
    public static void Queen_Placed(boolean [] box, int tq, int qpsf, int ind, String ans){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i = ind ; i < box.length; i++){
            if(!box[ind]){
                box[i] = true;
                Queen_Placed(box, tq, qpsf+1, i+1, ans+"b"+i+"q"+qpsf+" ");
                box[i] = false;
            }
        }
    }
}

