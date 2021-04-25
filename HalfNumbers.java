import java.util.HashMap;
import java.util.Map;

public class HalfNumbers {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            if (map.keySet().contains(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Integer key:map.keySet()){
            if (map.get(key)>n){
                return key;
            }
        }
        return 0;
    }
}
