import java.util.ArrayList;


public class TreeNodeSumIsSpecifiedValue {
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        dfs(root,sum,new ArrayList<>(),result);
        return result;
    }
    public static void dfs(TreeNode root, int sum, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        if (root==null){
            return;
        }
        ArrayList<Integer> subList = new ArrayList<>(list);
        subList.add(new Integer(root.val));
        if(root.left==null&&root.right==null){
            if (root.val==sum){
                result.add(subList);
            }
            return;
        }
        dfs(root.left,sum-root.val,subList,result);
        dfs(root.right,sum-root.val,subList,result);
    }
}
