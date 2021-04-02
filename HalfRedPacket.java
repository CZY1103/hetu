import java.util.Arrays;

public class HalfRedPacket {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i = 0;i < n;i++){
            if(gifts[i]==ans){
                num++;
            }
        }
        return num<=n/2?0:ans;
    }
}
