import java.util.*;

public class NearestCommonAncestorTwoNodes {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        //key 为当前结点值 ，value为父节点的值
        HashMap<Integer,Integer> parent = new HashMap<>();
        //进行层次遍历
        Queue<TreeNode> queue = new LinkedList<>();
        parent.put(root.val,Integer.MIN_VALUE);
        queue.add(root);
        //找到o1和o2，并记录他们的父节点
        while(!parent.containsKey(o1)||!parent.containsKey(o2)){
            TreeNode node = queue.poll();
            if(node.left!=null){
                parent.put(node.left.val,node.val);
                queue.add(node.left);
            }
            if(node.right!=null){
                parent.put(node.right.val,node.val);
                queue.add(node.right);
            }
        }
        //保存从o1结点到他的根节点的路径
        Set<Integer> set = new HashSet<>();
        while(parent.containsKey(o1)){
            set.add(o1);
            o1 = parent.get(o1);
        }
        //如果如果有o2或者其父节点，返回，没有则一直向上找o2的父节点
        while(!set.contains(o2)){
            o2 = parent.get(o2);
        }
        return o2;
    }
}
