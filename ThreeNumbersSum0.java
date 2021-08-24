import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNumbersSum0 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res  = new ArrayList<>();
        int len = num.length;
        if(len<3){
            return res;
        }
        Arrays.sort(num);
        for(int i = 0 ;i < len;i++){
            //如果num[i]>0,后面的都是比零大的，相加不可能为0
            if(num[i]>0){
                return res;
            }
            //去重
            if(i > 0 && num[i]==num[i-1]){
                continue;
            }
            int cur = num[i];
            int left = i+1;
            int right = len-1;
            while(left<right){
                int sum = cur+ num[left]+num[right];
                if(sum==0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(cur);
                    list.add(num[left]);
                    list.add(num[right]);
                    res.add(list);
                    while(left < right && num[left]==num[left+1]){
                        left++;
                    }
                    while(left < right && num[right]==num[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}
