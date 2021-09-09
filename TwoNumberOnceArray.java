import java.util.HashMap;
import java.util.Map;

public class TwoNumberOnceArray {
    public int[] FindNumsAppearOnce (int[] array) {
        int[] res = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i < array.length;i++){
            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i],1);
            }else{
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }
        }
        int i = 0;
        for(int k:hashMap.keySet()){
            if(hashMap.get(k)==1){
                res[i] = k;
                i++;
            }
        }
        if(array[0]>array[1]){
            int m = array[0];
            array[0] = array[1];
            array[1] = m;
        }
        return res;
    }
}
