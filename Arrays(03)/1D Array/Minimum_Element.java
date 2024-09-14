public class Minimum_Element {
    public static void main(String[] args) {
        int [] arr = {10,7,-18,7,-3,11,-9,7};
        System.out.println(Find_Minimum(arr));
    }

    public static int Find_Minimum(int [] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    
}
