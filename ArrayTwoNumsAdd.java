import java.util.HashMap;
import java.util.Map;

public class ArrayTwoNumsAdd {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ht = new HashMap<Integer, Integer>();
        for (int i = 0;i < nums.length;i++){
            if (ht.containsKey(target-nums[i])){
                return new int[]{ht.get(target-nums[i]),i};
            }
            ht.put(nums[i],i);
        }
        return new int[0];
    }
}
