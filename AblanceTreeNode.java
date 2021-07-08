public class AblanceTreeNode {
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDpth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDpth>rightDepth?leftDpth+1:rightDepth+1;
    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1
                &&IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);

    }
}
