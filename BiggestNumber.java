import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BiggestNumber {
    public String solve (int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        //转化为字符串
        for(int i = 0;i < nums.length;i++){
            list.add(String.valueOf(nums[i]));
        }
        //排序
        //Collections.sort默认升序排列
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                return (b+a).compareTo(a+b);
            }
        });
        //如果第一个字符为0，则返回“0”
        if(list.get(0).equals("0")){
            return "0";
        }
        //排序后进行拼接
        String res = "";
        for(int i = 0;i<list.size();i++){
            res+=list.get(i);
        }
        return res;
    }
}
