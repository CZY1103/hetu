public class SumSpecifiedValuesTree {
    public static boolean flag = false;
    public static void dif(TreeNode root,int sum,int cnt){
        if(root==null||flag==true){
            return;
        }
        cnt += root.val;
        if(root.left==null&&root.right==null){
            if(sum==cnt){
                flag = true;
            }
        }else{
            dif(root.left,sum,cnt);
            dif(root.right,sum,cnt);
        }
    }
    public boolean hasPathSum (TreeNode root, int sum) {
        dif(root,sum,0);
        return flag;
    }
}
