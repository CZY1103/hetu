import java.util.*;




public class BalanceTree {
    public static int hightRoot(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = hightRoot(root.left);
        int right = hightRoot(root.right);
        return left > right ? (left + 1) : (right + 1);
    }

    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int left = hightRoot(root.left);
        int right = hightRoot(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }
}
 class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
         this.val = val;
     }
 }
