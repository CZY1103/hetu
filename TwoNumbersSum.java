import java.util.HashMap;
import java.util.Map;

public class TwoNumbersSum {
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int cur = 0;cur < numbers.length;cur++){
            int temp = numbers[cur];
            if(map.containsKey(target-temp)){
                return new int[]{map.get(target-temp)+1,cur+1};
            }
            map.put(temp,cur);
        }
        throw new RuntimeException("results not exits");
    }
}
