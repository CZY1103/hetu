import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class RepeatNumbersArrangement {
    //标记是否被选择过
    public static boolean[] mark;
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        LinkedList<Integer> track = new LinkedList<>();
        mark = new boolean[num.length];
        Arrays.sort(num);
        backtrack(num,res,track);
        return res;
    }
    public static void backtrack(int[] num,ArrayList<ArrayList<Integer>> res,LinkedList<Integer> track){
        //如果找到一个全排列，则将他加进结果集中
        if(track.size()==num.length){
            res.add(new ArrayList<Integer>(track));
            return;
        }
        for(int i = 0;i < num.length;i++){
            if(mark[i]||i>0&&num[i]==num[i-1]&&!mark[i-1]){
                continue;
            }
            track.add(num[i]);
            mark[i] = true;
            backtrack(num,res,track);
            track.removeLast();
            mark[i] = false;
        }
    }
}
