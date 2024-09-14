public class Kartik_Bhaiya_and_String {
    public static void main(String[] args) {
        String str = "aabaabbbaaab";
        int k = 2;
        int flipa = Maximum_length(str,k,'a');
        int flipb = Maximum_length(str,k,'b');
        System.out.println(Math.max(flipa,flipb));
    }

    public static int Maximum_length(String str,int k, char ch){
        int si = 0;
        int ei = 0;
        int flip = 0;

        int ans = 0;
        while(ei < str.length()){
            char c = str.charAt(ei);
            if(c == ch){
                flip++;
            }
            
            while(si <= ei && flip > k){
                if(str.charAt(si) == ch){
                    flip--;
                }
                si++;
            }

            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
