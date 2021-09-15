import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutputRightViewTreeNode {
    public static List<Integer> res;
    public static Map<Integer,Integer> map;
    public int[] solve (int[] xianxu, int[] zhongxu) {
        res = new ArrayList<>();
        map = new HashMap<>();
        for(int i = 0;i < zhongxu.length;i++){
            map.put(zhongxu[i],i);
        }
        dfs(xianxu,0,xianxu.length-1,zhongxu,0,zhongxu.length-1,0);
        int[] ans = new int[res.size()];
        for(int i = 0;i < res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    public static void dfs(int[] xian,int start1,int end1,int[] zhong,int start2,int end2,int level){
        if(start1>end1){
            return;
        }
        int rootVal = xian[start1];//当前根节点
        //刚开始size=0，level=0 加入根节点
        //下一层，level=1，size=1，然后加入左节点
        if(res.size()<=level){
            res.add(rootVal);
        }else{//如果有右
            res.set(level,rootVal);
        }
        int i = map.get(rootVal);
        dfs(xian,start1+1,start1+i-start2,zhong,start2,i-1,level+1);
        dfs(xian,start1+i-start2+1,end1,zhong,i+1,end2,level+1);
    }
}
