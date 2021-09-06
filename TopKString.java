import java.util.*;

public class TopKString {
    class DescComparator implements Comparator<Map.Entry<String,Integer>>{
        @Override
        public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
            if(o1.getValue().equals(o2.getValue())){
                //值一样的话，字典序小的在前面
                return o2.getKey().compareTo(o1.getKey());
            }else{
                //否则，数量小的在前
                return o1.getValue()-o2.getValue();
            }
        }
    }
    public String[][] topKstrings (String[] strings, int k) {
        if(k== 0){
            return new String[][]{};
        }
        Comparator compa = new DescComparator();
        String[][] res = new String[k][2];
        TreeMap<String,Integer> map = new TreeMap<>();
        //统计各个字符出现的次数
        for(int i = 0;i < strings.length;i++){
            String s = strings[i];
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        PriorityQueue queue = new PriorityQueue(k,compa);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            //堆元素的个数小于k，则直接加入堆中
            if(queue.size()<k){
                queue.offer(entry);
            }else if(compa.compare(queue.peek(),entry)<0){
                //如果堆顶元素<新数，ze删除堆顶，加入新数入队
                queue.poll();
                queue.offer(entry);
            }
        }
        //返回topK
        for(int i = k-1;i>=0;i--){
            Map.Entry<String,Integer> entry = (Map.Entry)queue.poll();
            res[i][0] = entry.getKey();
            res[i][1] = String.valueOf(entry.getValue());
        }
        return res;
    }
}
