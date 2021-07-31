import java.util.LinkedList;
import java.util.Queue;

public class MirrorTreeNode2 {
    public TreeNode Mirror (TreeNode pRoot) {
        if(pRoot==null){
            return null;
        }
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()){
            TreeNode tRoot = queue.poll();
            TreeNode node = tRoot.left;
            tRoot.left = tRoot.right;
            tRoot.right = node;
            if(tRoot.left!=null){
                queue.add(tRoot.left);
            }
            if(tRoot.right!=null){
                queue.add(tRoot.right);
            }
        }
        return pRoot;
    }
}
