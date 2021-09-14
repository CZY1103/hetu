import java.util.ArrayList;

public class AllSubsetsOfSet {
    public static int length;
    public static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<Integer> record = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        length = S.length;
        dfs(S,0);
        return res;
    }
    public static void dfs(int[] S,int position){
        //当前位置的索引越过数组的索引，则将自己添加到结果集合中
        if(position>length-1){
            res.add(new ArrayList<>(record));
            return;
        }
        //子集不包含当前的数字
        dfs(S,position+1);
        //子集包含当前的数字
        record.add(S[position]);
        dfs(S,position+1);
        //复原回溯
        record.remove(record.size()-1);
    }
}
