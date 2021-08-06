import java.util.HashMap;
import java.util.Map;

public class LongestSumChildArray {
    public int maxlenEqualK (int[] arr, int k){
        if(arr==null||arr.length==0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int len = 0;
        for (int i = 0;i < arr.length;i++){
            sum = sum+arr[i];
            if(map.containsKey(sum-k)){
                len = Math.max(len,i-map.get(sum-k));
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
}
