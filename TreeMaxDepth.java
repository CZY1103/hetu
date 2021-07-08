public class TreeMaxDepth {
    public int maxDepth (TreeNode root) {
        int hength = 1;
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth>rightDepth?1+leftDepth:1+rightDepth;
    }
}
