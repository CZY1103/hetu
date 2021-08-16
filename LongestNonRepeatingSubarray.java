import java.util.HashMap;

public class LongestNonRepeatingSubarray {
    public int maxLength (int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = 0;//长度
        int left = -1;
        for(int right = 0;right < arr.length;right++){
            if(map.containsKey(arr[right])){
                left = Math.max(left,map.get(arr[right]));
            }
            length = Math.max(length,right-left);
            map.put(arr[right],right);
        }
        return length;
    }
}
